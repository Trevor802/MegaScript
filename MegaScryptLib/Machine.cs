using System;
using System.Collections.Generic;
using Antlr4.Runtime;
namespace MegaScrypt
{
    public class Machine
    {
        private Processor m_processor;
        private Stack m_stack;

        public Machine() {
            m_stack = new Stack();
            m_processor = new Processor(m_stack);
        }

        public object Execute(string script)
        {
            AntlrInputStream stream = new AntlrInputStream(script);
            CalculatorLexer lexer = new CalculatorLexer(stream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CalculatorParser parser = new CalculatorParser(tokenStream);
            var root = parser.program();
            if (root.IsEmpty && root.exception != null) {
                if (root.exception is RecognitionException) {
                    throw new Exception("null");
                }
                else {
                    throw new InvalidOperationException();
                }
            }
            object result = root.Accept(m_processor);
            return result;
        }

        public object Evaluate(string expression)
        {
            AntlrInputStream stream = new AntlrInputStream(expression);
            CalculatorLexer lexer = new CalculatorLexer(stream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CalculatorParser parser = new CalculatorParser(tokenStream);

            var root = parser.expression();
            object result = root.Accept(m_processor);
            return result;
        }

        public string DumpStack() {
            return m_stack.ToString();
        }

        public void Declare(string id, object value) {
            m_stack.Declare(id, value);
        }
    }
}
