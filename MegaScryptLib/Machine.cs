using System;
using MSLib;
namespace MegaScrypt
{
    public class Machine
    {
        public object Execute(string script)
        {
            throw new NotImplementedException();
        }

        public object Evaluate(string expression)
        {
            Calculator calculator = new Calculator();
            return calculator.Evaluate(expression);
        }
    }
}
