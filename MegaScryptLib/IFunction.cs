using System;
using System.Collections.Generic;

namespace MegaScrypt {
    interface IFunction {
        string Name { get; }
        List<string> ParamNameList { get; }
        object Invoke(List<object> paramList);
    }
}
