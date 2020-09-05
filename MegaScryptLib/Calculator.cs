using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
namespace MSLib {
    public class Calculator : CalculatorBaseVisitor<object>{
        public object Evaluate(string expression) {
            AntlrInputStream stream = new AntlrInputStream(expression);
            CalculatorLexer lexer = new CalculatorLexer(stream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CalculatorParser parser = new CalculatorParser(tokenStream);

            var root = parser.expression();
            object result = root.Accept(this);
            return result;
        }

        public override object VisitNumber([NotNull] CalculatorParser.NumberContext context){
            if (context.Dot() != null){
                float f = float.Parse(context.GetText());
                return f;
            }
            else{
                int i = int.Parse(context.GetText());
                return i;
            }
            throw new NotImplementedException();
        }

        public override object VisitBool([NotNull] CalculatorParser.BoolContext context) {
            bool b = bool.Parse(context.GetText());
            return b;
        }

        public override object VisitBooleanExpr([NotNull] CalculatorParser.BooleanExprContext context) {
            if (context.@bool() != null) {
                var result = context.@bool().Accept(this);
                return result;
            }
            CalculatorParser.BooleanExprContext[] exprs = context.booleanExpr();
            if (exprs.Length == 1) {
                object result = exprs[0].Accept(this);
                if (context.Not() != null) {
                    result = !(bool)result;
                }
                return result;
            }
            else if (exprs.Length == 2) {
                object lhs = exprs[0].Accept(this);
                object rhs = exprs[1].Accept(this);
                var op = context.children[1] as ITerminalNode;
                return BooleanLogicalOperation(lhs, rhs, op);
            }
            throw new NotImplementedException();
        }

        public override object VisitNumericExpr([NotNull] CalculatorParser.NumericExprContext context) {
            if (context.number() != null) {
                var result = context.number().Accept(this);
                return result;
            }
            CalculatorParser.NumericExprContext[] exprs = context.numericExpr();
            if (exprs.Length == 1) {
                object result = exprs[0].Accept(this);
                if (context.Minus() != null) {
                    if (result is int) {
                        return -(int)result;
                    }
                    else {
                        return -(float)result;
                    }
                }
                return result;
            }
            else if (exprs.Length == 2) {
                object lhs = exprs[0].Accept(this);
                object rhs = exprs[1].Accept(this);
                var op = context.children[1] as ITerminalNode;
                if (lhs is int && rhs is int) {
                    return IntegerBinaryOperation(lhs, rhs, op);
                }
                else {
                    return FloatBinaryOperation(lhs, rhs, op);
                }
            }
            throw new NotImplementedException();
        }

        public override object VisitExpression([NotNull] CalculatorParser.ExpressionContext context){
            if (context.booleanExpr() != null) {
                var result = context.booleanExpr().Accept(this);
                return result;
            }
            else{
                var result = context.numericExpr().Accept(this);
                return result;
            }
        }
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
            }
            return result;
        }

        private float FloatBinaryOperation(object lhs, object rhs, ITerminalNode op){
            float l = Convert.ToSingle(lhs);
            float r = Convert.ToSingle(rhs);
            float result = 0;
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
            }
            return result;
        }
 
        private int IntegerBinaryOperation(object lhs, object rhs, ITerminalNode op){
            int l = Convert.ToInt32(lhs);
            int r = Convert.ToInt32(rhs);
            int result = 0;
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
            }
            return result;
        }
    }
}