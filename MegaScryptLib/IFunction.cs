using System;
using System.Collections.Generic;

namespace MegaScrypt {
    internal interface IFunction {
        string Name { get; }
        List<string> ParamNameList { get; }
        object Invoke(List<object> paramList, Stack stack);
    }
}
