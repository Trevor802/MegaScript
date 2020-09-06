using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
namespace MSLib {
    internal class Processor : CalculatorBaseVisitor<object>{
        private Stack m_stack;

        public Processor(Stack stack) {
            m_stack = stack;
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
            var varName = context.Id().Accept(this) as string;
            object varValue = null;
            if (context.expression() != null) {
                varValue = context.expression().Accept(this);
            }
            m_stack.Set(varName, varValue);
            return varValue;
        }

        public override object VisitTerminal(ITerminalNode node) {
            switch (node.Symbol.Type) {
                case CalculatorParser.Number: {
                        string s = node.GetText();
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
            }
            return base.VisitTerminal(node);
            throw new InvalidOperationException();
        }

        protected object GetValue(ITerminalNode node) {
            return m_stack.Get(node.GetText());
        }

        public override object VisitExpression([NotNull] CalculatorParser.ExpressionContext context) {
            if (context.children.Count == 1) {
                object result = null;
                // If it is an Id, then return the value
                if (context.Id() != null) {
                    result = GetValue(context.Id());
                    return result;
                }
                // Else let VisitTerminal handle it
                result = context.children[0].Accept(this);
                return result;
            }
            var exprs = context.expression();
            if (exprs.Length == 1) {
                var n = exprs[0].Accept(this);
                var op = context.children[0] as ITerminalNode;
                return UnaryOperation(n, op);
            }
            if (exprs.Length == 2) {
                var l = exprs[0].Accept(this);
                var r = exprs[1].Accept(this);
                var op = context.children[1] as ITerminalNode;
                return BinaryOperation(l, r, op);
            }
            throw new InvalidOperationException();
        }

        private object UnaryOperation(object n, ITerminalNode op) {
            if (op.Symbol.Type == CalculatorParser.Not && n is bool) {
                return !(bool)n;
            }
            if (op.Symbol.Type == CalculatorParser.Minus && n is int) {
                return -(int)n;
            }
            if (op.Symbol.Type == CalculatorParser.Minus && n is float) {
                return -(float)n;
            }
            return n;
        }

        private object BinaryOperation(object l, object r, ITerminalNode op) {
            if (l is bool && r is bool) {
                return BooleanLogicalOperation(l, r, op); 
            }
            if (l is int && r is int) {
                return IntegerBinaryOperation(l, r, op);
            }
            return FloatBinaryOperation(l, r, op);
        }

        //public override object VisitBooleanExpr([NotNull] CalculatorParser.BooleanExprContext context) {
        //    if (context.@bool() != null) {
        //        var result = context.@bool().Accept(this);
        //        return result;
        //    }
        //    if (context.id() != null) {
        //        return m_stack.Get(context.id().Accept(this) as string);
        //    }
        //    var bExprs = context.booleanExpr();
        //    if (bExprs.Length == 1) {
        //        object result = bExprs[0].Accept(this);
        //        if (context.Not() != null) {
        //            result = !(bool)result;
        //        }
        //        return result;
        //    }
        //    else if (bExprs.Length == 2) {
        //        object lhs = bExprs[0].Accept(this);
        //        object rhs = bExprs[1].Accept(this);
        //        var op = context.children[1] as ITerminalNode;
        //        return BooleanLogicalOperation(lhs, rhs, op);
        //    }
        //    var nExprs = context.numericExpr();
        //    if (nExprs.Length == 2) {
        //        object lhs = nExprs[0].Accept(this);
        //        object rhs = nExprs[1].Accept(this);
        //        var op = context.children[1] as ITerminalNode;
        //        if (lhs is int && rhs is int) {
        //            return IntegerRelationalOperation(lhs, rhs, op);
        //        }
        //        else {
        //            return FloatRelationalOperation(lhs, rhs, op);
        //        }
        //    }
        //    throw new NotImplementedException();
        //}

        //public override object VisitNumericExpr([NotNull] CalculatorParser.NumericExprContext context) {
        //    if (context.number() != null) {
        //        var result = context.number().Accept(this);
        //        return result;
        //    }
        //    if (context.id() != null) {
        //        return m_stack.Get(context.id().Accept(this) as string);
        //    }
        //    CalculatorParser.NumericExprContext[] exprs = context.numericExpr();
        //    if (exprs.Length == 1) {
        //        object result = exprs[0].Accept(this);
        //        if (context.Minus() != null) {
        //            if (result is int) {
        //                return -(int)result;
        //            }
        //            else {
        //                return -(float)result;
        //            }
        //        }
        //        return result;
        //    }
        //    else if (exprs.Length == 2) {
        //        object lhs = exprs[0].Accept(this);
        //        object rhs = exprs[1].Accept(this);
        //        var op = context.children[1] as ITerminalNode;
        //        if (lhs is int && rhs is int) {
        //            return IntegerBinaryOperation(lhs, rhs, op);
        //        }
        //        else {
        //            return FloatBinaryOperation(lhs, rhs, op);
        //        }
        //    }
        //    throw new NotImplementedException();
        //}

        private bool BooleanLogicalOperation(object lhs, object rhs, ITerminalNode op) {
            bool l = Convert.ToBoolean(lhs);
            bool r = Convert.ToBoolean(rhs);
            bool result = false;
            switch (op.Symbol.Type) {
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

        private object IntegerBinaryOperation(object lhs, object rhs, ITerminalNode op) {
            int l = Convert.ToInt32(lhs);
            int r = Convert.ToInt32(rhs);
            object result = null;
            switch (op.Symbol.Type) {
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

        private object FloatBinaryOperation(object lhs, object rhs, ITerminalNode op){
            float l = Convert.ToSingle(lhs);
            float r = Convert.ToSingle(rhs);
            object result = null;
            switch (op.Symbol.Type){
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