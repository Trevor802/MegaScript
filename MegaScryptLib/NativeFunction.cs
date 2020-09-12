using System.Linq;
using System.Collections.Generic;

namespace MegaScrypt {
    public class NativeFunction : IFunction {
        private string m_name = "";
        private List<string> m_paramNameList;

        public string Name => m_name;
        public List<string> ParamNameList => m_paramNameList;

        public delegate object Callback(List<object> parameters);
        private Callback m_callback;

        internal NativeFunction(Callback callback, IEnumerable<string> parameters) {
            m_callback = callback;
            m_paramNameList = parameters is null ? null : parameters.ToList();
            m_name = callback.Method.Name;
        }

        public object Invoke(List<object> paramList) {
            var ret = m_callback(paramList);
            return ret;
        }
    }
}
