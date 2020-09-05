using System;
using MSLib;
namespace MegaScrypt
{
    public class Machine
    {
        private Calculator m_calculator = new Calculator();

        public object Execute(string script)
        {
            throw new NotImplementedException();
        }

        public object Evaluate(string expression)
        {
            return m_calculator.Evaluate(expression);
        }
    }
}
