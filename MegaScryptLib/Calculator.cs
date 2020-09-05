using System;
using Antlr4.Runtime;
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

        public override object VisitNumber(CalculatorParser.NumberContext context){
            if (context.Dot() != null){
                float f = float.Parse(context.GetText());
                return f;
            }
            else{
                int i = int.Parse(context.GetText());
                return i;
            }
            throw new System.NotImplementedException();
        }

        public override object VisitExpression(CalculatorParser.ExpressionContext context){
            if (context.number() != null){
                var result = context.number().Accept(this);
                return result;
            }
            CalculatorParser.ExpressionContext[] exprs = context.expression();
            if (exprs.Length == 1){
                object result = exprs[0].Accept(this);
                if (context.Minus() != null){
                    if (result is int){
                        return -(int)result;
                    }
                    else{
                        return -(float)result;
                    }
                }
                return result;
            }
            else if(exprs.Length == 2){
                object lhs = exprs[0].Accept(this);
                object rhs = exprs[1].Accept(this);
                var op = context.children[1] as ITerminalNode;
                if (lhs is int && rhs is int){
                    return IntegerBinaryOperation(lhs, rhs, op);
                }
                else{
                    return FloatBinaryOperation(lhs, rhs, op);
                }
            }
            throw new System.NotImplementedException();
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