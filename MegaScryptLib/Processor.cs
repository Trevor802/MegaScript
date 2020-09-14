using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System.Collections.Generic;
using System.Diagnostics;

namespace MegaScrypt {
    internal class Processor : CalculatorBaseVisitor<object>{
        private Stack m_stack;
        private Stack m_iterStack;
        private string m_iterName;
        private object m_lastRetValue = null;
        private bool m_returned = false;
        private bool m_broken = false;
        private bool m_continued = false;

        public Processor(Stack stack) {
            m_stack = stack;
            m_iterStack = m_stack;
            m_iterName = "";
        }

        public override object VisitForeachStmt([NotNull] CalculatorParser.ForeachStmtContext context) {
            var enumerable = context.expression().Accept(this) as IEnumerable<object>;
            var enumerator = enumerable.GetEnumerator();
            context.declaration().Accept(this);
            var varName = m_iterName;
            while (enumerator.MoveNext()) {
                m_stack.Set(varName, enumerator.Current);
                context.block().Accept(this);
            }
            m_iterName = "";
            return null;
        }

        public override object VisitDoWhileStmt([NotNull] CalculatorParser.DoWhileStmtContext context) {
            do {
                context.block().Accept(this);
                if (m_broken) {
                    m_broken = false;
                    break;
                }
                if (m_continued) {
                    m_continued = false;
                    continue;
                }
            }
            while ((bool)context.expression().Accept(this));
            return null;
        }

        public override object VisitWhileStmt([NotNull] CalculatorParser.WhileStmtContext context) {
            while ((bool)context.expression().Accept(this)) {
                context.block().Accept(this);
                if (m_broken) {
                    m_broken = false;
                    break;
                }
                if (m_continued) {
                    m_continued = false;
                    continue;
                }
            }
            return null;
        }

        public override object VisitBreakStmt([NotNull] CalculatorParser.BreakStmtContext context) {
            m_broken = true;
            return null;
        }

        public override object VisitContinueStmt([NotNull] CalculatorParser.ContinueStmtContext context) {
            m_continued = true;
            return null;
        }

        public override object VisitForStmt([NotNull] CalculatorParser.ForStmtContext context) {
            var stack = new Stack(m_stack);
            var oldStack = m_stack;
            m_stack = stack;
            if (context.declaration() != null) {
                context.declaration().Accept(this);
            }
            while(context.expression() is null || (bool)context.expression().Accept(this)) {
                context.block().Accept(this);
                if (m_broken) {
                    m_broken = false;
                    break;
                }
                if (context.forAssign() != null) {
                    context.forAssign().Accept(this);
                }
                if (m_continued) {
                    m_continued = false;
                    continue;
                }
            }
            m_stack = oldStack;
            return null;
        }

        public override object VisitArray([NotNull] CalculatorParser.ArrayContext context) {
            return new Array(context.paramList() is null ? null : context.paramList().Accept(this) as List<object>);
        }

        public override object VisitStatement([NotNull] CalculatorParser.StatementContext context) {
            if (m_returned) {
                return m_lastRetValue;
            }
            if (m_broken || m_continued) {
                return null;
            }
            return base.VisitStatement(context);
        }

        public override object VisitVarList([NotNull] CalculatorParser.VarListContext context) {
            var result = new List<string>();
            var exprs = context.Id();
            foreach (var expr in exprs) {
                result.Add(expr.Accept(this) as string);
            }
            return result;
        }

        public override object VisitRetStmt([NotNull] CalculatorParser.RetStmtContext context) {
            m_lastRetValue = context.expression() is null ? null : context.expression().Accept(this);
            m_returned = true;
            return m_lastRetValue;
        }

        public override object VisitFuncDeclaration([NotNull] CalculatorParser.FuncDeclarationContext context) {
            var func = new ScriptFunction(this, Invoke, context);
            return func;
        }

        private object Invoke(ScriptFunction func, List<object> parameters, Stack parentStack = null) {
            var oldSt = m_stack;
            m_stack = new Stack(parentStack is null ? oldSt : parentStack);
            if (parameters != null) {
                if (func.ParamNameList.Count != parameters.Count) {
                    throw new InvalidOperationException("number");
                }
                for(int i = 0; i < parameters.Count; i++) {
                    m_stack.Declare(func.ParamNameList[i], parameters[i]);
                }
            }
            m_lastRetValue = null;
            m_returned = false;
            base.VisitFuncDeclaration(func.Context);
            m_stack = oldSt;
            var ret = m_lastRetValue;
            m_lastRetValue = false;
            return ret;
        }

        public override object VisitInvocation([NotNull] CalculatorParser.InvocationContext context) {
            Stack iStack = m_stack;
            var varName = "";
            object oldObj = null;
            try {
                oldObj = GetValue(context.Id()[0]);
            }
            catch (KeyNotFoundException e) {
                throw new Exception("Key is undeclared");
            }
            // Assign value to variable in object
            if (context.Id().Length > 1) {
                iStack = (Stack)oldObj;
                for (int i = 1; i < context.Id().Length - 1; i++) {
                    string k = context.Id()[i].Accept(this) as string;
                    iStack = (Stack)iStack.Get(k, out _);
                }
                // TODO: out stack
                varName = context.Id()[context.Id().Length - 1].Accept(this) as string;
                oldObj = iStack.Get(varName, out _);
            }
            // Assign value to current stack
            else {
                oldObj = iStack.Get(context.Id()[0].GetText(), out _);
            }
            var func = oldObj as IFunction;
            if (func is null) {
                throw new InvalidOperationException();
            }
            var paramList = context.paramList().Accept(this) as List<object>;
            if (paramList is null) {
                paramList = new List<object>();
            }
            var ret = func.Invoke(paramList, iStack);
            return ret;
        }

        public override object VisitParamList([NotNull] CalculatorParser.ParamListContext context) {
            var result = new List<object>();
            var exprs = context.expression();
            foreach (var expr in exprs) {
                result.Add(expr.Accept(this));
            }
            return result;
        }

        public override object VisitObject([NotNull] CalculatorParser.ObjectContext context) {
            var stack = new Stack(m_stack);
            KeyValuePair<string, object> fieldDecl;
            foreach (var item in context.fieldDeclaration()) {
                fieldDecl = (KeyValuePair<string, object>)item.Accept(this);
                stack.Declare(fieldDecl.Key, fieldDecl.Value);
            }
            return stack;
        }

        public override object VisitFieldDeclaration([NotNull] CalculatorParser.FieldDeclarationContext context) {
            var varName = context.Id().Accept(this) as string;
            var varValue = context.expression().Accept(this);
            return new KeyValuePair<string, object>(varName, varValue);
        }

        public override object VisitBlock([NotNull] CalculatorParser.BlockContext context) {
            var stack = new Stack(m_stack);
            // Save the old stack's reference
            var oldStack = m_stack;
            m_stack = stack;
            var result = base.VisitBlock(context);
            // Retrieve the old stack
            m_stack = oldStack;
            return result;
        }

        public override object VisitDeclaration([NotNull] CalculatorParser.DeclarationContext context) {
            var varName = context.Id().Accept(this) as string;
            object varValue = null;
            if (context.expression() != null) {
                varValue = context.expression().Accept(this);
            }
            m_iterName = varName;
            m_stack.Declare(varName, varValue);
            return varValue;
        }

        public override object VisitAssignment([NotNull] CalculatorParser.AssignmentContext context) {
            object oldValue = context.expression()[0].Accept(this);
            var varName = m_iterName;
            var stack = m_iterStack;
            object newValue = context.expression()[1].Accept(this);
            var op = context.children[1] as ITerminalNode;
            switch (op.Symbol.Type) {
                case CalculatorParser.AddAss:
                    newValue = BinaryOperation(oldValue, newValue, CalculatorParser.Plus);
                    break;
                case CalculatorParser.MinusAss:
                    newValue = BinaryOperation(oldValue, newValue, CalculatorParser.Minus);
                    break;
                case CalculatorParser.MultiplyAss:
                    newValue = BinaryOperation(oldValue, newValue, CalculatorParser.Multiply);
                    break;
                case CalculatorParser.DivideAss:
                    newValue = BinaryOperation(oldValue, newValue, CalculatorParser.Divide);
                    break;
            }
            if (stack is Array array) {
                array[Convert.ToInt32(varName)] = newValue;
            }
            else {
                stack.Set(varName, newValue);
            }
            m_iterStack = m_stack;
            m_iterName = "";
            return newValue;
        }

        public override object VisitIfStmt([NotNull] CalculatorParser.IfStmtContext context) {
            var exprs = context.expression();
            var blocks = context.block();
            object result = null;
            bool hasElse = blocks.Length - exprs.Length == 1;
            bool condition = Convert.ToBoolean(context.expression()[0].Accept(this));
            if (condition) {
                result = context.block()[0].Accept(this);
                return result;
            }
            for(int i = 1; i < (hasElse ? exprs.Length -1 : exprs.Length); i++) {
                condition = Convert.ToBoolean(context.expression()[i].Accept(this));
                if (condition) {
                    result = context.block()[i].Accept(this);
                    return result;
                }
            }
            if (hasElse) {
                result = context.block()[context.block().Length - 1].Accept(this);
            }
            return result;
        }

        public override object VisitTerminal(ITerminalNode node) {
            string s = "";
            int i = 0;
            switch (node.Symbol.Type) {
                case CalculatorParser.Number: {
                        s = node.GetText();
                        if (s.Contains(".")) {
                            float f = float.Parse(s);
                            return f;
                        }
                        else {
                            i = int.Parse(s);
                            return i;
                        }
                    }
                case CalculatorParser.True:
                    return true;
                case CalculatorParser.False:
                    return false;
                case CalculatorParser.Id:
                    return node.GetText();
                case CalculatorParser.String:
                    s = node.GetText();
                    s = s.Substring(1, s.Length - 2);
                    return s;
                case CalculatorParser.Null:
                    return null;
            }
            return base.VisitTerminal(node);
        }

        protected object GetValue(ITerminalNode node, out Stack stack) {
            var result = m_stack.Get(node.GetText(), out stack);
            m_iterStack = stack;
            m_iterName = node.GetText();
            return result;
        }

        protected object GetValue(ITerminalNode node) {
            m_iterName = node.GetText();
            return m_stack.Get(node.GetText(), out m_iterStack);// TODO: Formatting the code
        }

        public override object VisitIncrementExpr([NotNull] CalculatorParser.IncrementExprContext context) {
            var varName = context.Id().Accept(this) as string;
            object oldValue = GetValue(context.Id());
            var newValue = (int)oldValue + 1;
            var node = context.children[0] as ITerminalNode;
            m_stack.Set(varName, newValue);
            // Pre-increment
            if (node.Symbol.Type == CalculatorParser.Increment) {
                return GetValue(context.Id());
            }
            // Post-increment
            else {
                return oldValue;
            }
        }

        public override object VisitDecrementExpr([NotNull] CalculatorParser.DecrementExprContext context) {
            var varName = context.Id().Accept(this) as string;
            object oldValue = GetValue(context.Id());
            var newValue = (int)oldValue - 1;
            var node = context.children[0] as ITerminalNode;
            m_stack.Set(varName, newValue);
            // Pre-decrement
            if (node.Symbol.Type == CalculatorParser.Decrement) {
                return GetValue(context.Id());
            }
            // Post-decrement
            else {
                return oldValue;
            }
        }

        public override object VisitExpression([NotNull] CalculatorParser.ExpressionContext context) {
            object result = null;
            if (context.children.Count == 1) {
                // If it is an Id, then return the value
                if (context.Id() != null) {
                    try {
                        result = GetValue(context.Id());
                    }
                    catch (KeyNotFoundException e) {
                        throw new Exception($"{context.Id().Accept(this) as string} is undeclared");
                    }
                    return result;
                }
                // Else let VisitTerminal handle it
                result = context.children[0].Accept(this);
                return result;
            }
            var exprs = context.expression();
            if (exprs.Length == 1) {
                //if (context.Id() != null) {
                //    var d = exprs[0].Accept(this);
                //    var s = context.Id().Accept(this);
                //    result = ObjectOperation(d, s, CalculatorParser.Dot);
                //    return result;
                //}
                // ++x, --x
                var op = context.children[0] as ITerminalNode;
                result = UnaryOperation(exprs[0], op);
                return result;
            }
            if (exprs.Length == 2) {
                object l = null;
                object r = null;
                var op = context.children[1] as ITerminalNode;
                if (op.Symbol.Type == CalculatorParser.Dot) {
                    l = exprs[0].Accept(this);
                    r = exprs[1].Id().Accept(this);
                    result = ObjectOperation(l as Stack, r, op.Symbol.Type);
                    return result;
                }
                if (op.Symbol.Type == CalculatorParser.LeftBracket) {
                    l = exprs[0].Accept(this);
                    r = exprs[1].Accept(this);
                    result = ObjectOperation(l as Stack, r, op.Symbol.Type);
                    return result;
                }
                l = exprs[0].Accept(this);
                r = exprs[1].Accept(this);
                return BinaryOperation(l, r, op.Symbol.Type);
            }
            throw new InvalidOperationException();
        }

        private object UnaryOperation(CalculatorParser.ExpressionContext e, ITerminalNode op) {
            var n = e.Accept(this);
            //var varName = "";
            //object varValue = null;
            switch (op.Symbol.Type) {
                case CalculatorParser.Not:
                    return !(bool)n;
                case CalculatorParser.Minus:
                    if (n is int)
                        return -(int)n;
                    else
                        return -(float)n;
            }
            return n;
        }

        private object ObjectOperation(Stack stack, object k, int op) {
            m_iterStack = stack;
            m_iterName = Convert.ToString(k);
            switch (op) {
                case CalculatorParser.Dot:
                    return stack.Get(m_iterName, out _);
                case CalculatorParser.LeftBracket:
                    if (stack is Array array) {
                        return array[Convert.ToInt32(k)];
                    }
                    break;
            }
            throw new InvalidOperationException();
        }

        private object BinaryOperation(object l, object r, int op) {
            if (l is Stack stack && r is string) {
                return ObjectOperation(stack, r, op);
            }
            if (l is bool && r is bool) {
                return BooleanLogicalOperation(l, r, op);
            }
            if (l is string && r is string) {
                return StringBinaryOperation(l, r, op);
            }
            if (l is int && r is int) {
                return IntegerBinaryOperation(l, r, op);
            }
            return FloatBinaryOperation(l, r, op);
        }

        private bool BooleanLogicalOperation(object lhs, object rhs, int op) {
            bool l = Convert.ToBoolean(lhs);
            bool r = Convert.ToBoolean(rhs);
            bool result = false;
            switch (op) {
                case CalculatorParser.And:
                    result = l && r;
                    break;
                case CalculatorParser.Or:
                    result = l || r;
                    break;
                case CalculatorParser.Equal:
                    result = l == r;
                    break;
                case CalculatorParser.NotEqual:
                    result = l != r;
                    break;
                default:
                    throw new InvalidOperationException();
            }
            return result;
        }

        private object StringBinaryOperation(object lhs, object rhs, int op) {
            string l = Convert.ToString(lhs);
            string r = Convert.ToString(rhs);
            object result = null;
            switch (op) {
                case CalculatorParser.Plus:
                    result = l + r;
                    break;
            }
            return result;
        }

        private object IntegerBinaryOperation(object lhs, object rhs, int op) {
            int l = Convert.ToInt32(lhs);
            int r = Convert.ToInt32(rhs);
            object result = null;
            switch (op) {
                case CalculatorParser.Plus:
                    result = l + r;
                    break;
                case CalculatorParser.Minus:
                    result = l - r;
                    break;
                case CalculatorParser.Multiply:
                    result = l * r;
                    break;
                case CalculatorParser.Divide:
                    result = l / r;
                    break;
                case CalculatorParser.Modulo:
                    result = l % r;
                    break;
                case CalculatorParser.Greater:
                    result = l > r;
                    break;
                case CalculatorParser.GreaterEqual:
                    result = l >= r;
                    break;
                case CalculatorParser.Less:
                    result = l < r;
                    break;
                case CalculatorParser.LessEqual:
                    result = l <= r;
                    break;
                case CalculatorParser.Equal:
                    result = l == r;
                    break;
                case CalculatorParser.NotEqual:
                    result = l != r;
                    break;
                default:
                    throw new InvalidOperationException();
            }
            return result;
        }

        private object FloatBinaryOperation(object lhs, object rhs, int op){
            float l = Convert.ToSingle(lhs);
            float r = Convert.ToSingle(rhs);
            object result = null;
            switch (op){
                case CalculatorParser.Plus: 
                    result = l + r;
                    break;
                case CalculatorParser.Minus:
                    result = l - r;
                    break;
                case CalculatorParser.Multiply:
                    result = l * r;
                    break;
                case CalculatorParser.Divide:
                    result = l / r;
                    break;
                case CalculatorParser.Modulo:
                    result = l % r;
                    break;
                case CalculatorParser.Greater:
                    result = l > r;
                    break;
                case CalculatorParser.GreaterEqual:
                    result = l >= r;
                    break;
                case CalculatorParser.Less:
                    result = l < r;
                    break;
                case CalculatorParser.LessEqual:
                    result = l <= r;
                    break;
                case CalculatorParser.Equal:
                    result = l == r;
                    break;
                case CalculatorParser.NotEqual:
                    result = l != r;
                    break;
                default:
                    throw new InvalidOperationException();
            }
            return result;
        }
    }
}