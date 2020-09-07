using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System.Collections.Generic;

namespace MSLib {
    internal class Processor : CalculatorBaseVisitor<object>{
        private Stack m_stack;

        public Processor(Stack stack) {
            m_stack = stack;
        }

        public override object VisitStatement([NotNull] CalculatorParser.StatementContext context) {
            if (context.expression() != null) {
                throw new Exception("null");
            }
            return base.VisitStatement(context);
        }

        public override object VisitObject([NotNull] CalculatorParser.ObjectContext context) {
            var dict = new Dictionary<string, object>();
            KeyValuePair<string, object> fieldDecl;
            foreach (var item in context.fieldDeclaration()) {
                fieldDecl = (KeyValuePair<string, object>)item.Accept(this);
                dict.Add(fieldDecl.Key, fieldDecl.Value);
            }
            return dict;
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
            m_stack.Declare(varName, varValue);
            return varValue;
        }

        public override object VisitAssignment([NotNull] CalculatorParser.AssignmentContext context) {
            var varName = "";
            object oldValue = null;
            object newValue = null;
            try {
                oldValue = GetValue(context.Id()[0]);
            }
            catch (KeyNotFoundException e) {
                throw new Exception("Key is undeclared");
            }
            Dictionary<string, object> dict = null;
            // Assign value to variable in object
            if (context.Id().Length > 1) {
                dict = (Dictionary<string, object>)oldValue;
                for (int i = 1; i < context.Id().Length - 1; i++) {
                    string k = context.Id()[i].Accept(this) as string;
                    dict = (Dictionary<string, object>)dict[k];
                }
                varName = context.Id()[context.Id().Length - 1].Accept(this) as string;
                oldValue = dict[varName];
            }
            // Assign value to current stack
            else {
                varName = context.Id()[0].Accept(this) as string;
                oldValue = GetValue(context.Id()[0]);
            }
            // =/+=/-=/*=//=/
            if (context.expression() != null) {
                newValue = context.expression().Accept(this);
            }
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
            if (context.Id().Length > 1) {
                dict[varName] = newValue;
            }
            else {
                m_stack.Set(varName, newValue);
            }
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
            switch (node.Symbol.Type) {
                case CalculatorParser.Number: {
                        s = node.GetText();
                        if (s.Contains(".")) {
                            float f = float.Parse(s);
                            return f;
                        }
                        else {
                            int i = int.Parse(s);
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

        protected object GetValue(ITerminalNode node) {
            return m_stack.Get(node.GetText());
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
                if (context.Id() != null) {
                    var d = exprs[0].Accept(this);
                    var s = context.Id().Accept(this);
                    result = ObjectOperation(d, s, CalculatorParser.Dot);
                    return result;
                }
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
                    result = ObjectOperation(l, r, CalculatorParser.Dot);
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
                //case CalculatorParser.Increment:
                //    varName = e.Id().Accept(this) as string;
                //    varValue = GetValue(e.Id());
                //    m_stack.Set(varName, (int)varValue + 1);
                //    return GetValue(e.Id());
                //case CalculatorParser.Decrement:
                //    varName = e.Id().Accept(this) as string;
                //    varValue = GetValue(e.Id());
                //    m_stack.Set(varName, (int)varValue - 1);
                //    return GetValue(e.Id());
            }
            return n;
        }

        private object ObjectOperation(object o, object k, int op) {
            var dict = (Dictionary<string, object>)o;
            return dict[Convert.ToString(k)];
        }

        private object BinaryOperation(object l, object r, int op) {
            if (l is Dictionary<string, object> && r is string) {
                return ObjectOperation(l, r, op);
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