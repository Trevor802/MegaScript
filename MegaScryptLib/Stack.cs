using System;
using System.Collections.Generic;

namespace MegaScrypt
{
    public class Stack
    {
        private Stack parent = null;
        private Dictionary<string, object> m_dict;

        public Stack(Stack parent = null)
        {
            this.parent = parent;
            m_dict = new Dictionary<string, object>();
        }

        public void Declare(string varName, object value = null)
        {
            if (varName == "prototype") {
                parent = value as Stack;
                return;
            }
            try {
                m_dict.Add(varName, value);
            }
            catch (ArgumentException e) {
                throw new Exception("Variable is already declared");
            }
        }

        public void Declare(NativeFunction func) {
            Declare(func.Name, func);
        }

        public void Declare(NativeFunction.Callback callback, IEnumerable<string> paramNameList = null) {
            NativeFunction func = new NativeFunction(callback, paramNameList);
            Declare(func.Name, func);
        }
        internal delegate object Getter();
        internal delegate void Setter(object value);
        private Dictionary<string, Setter> m_setters = new Dictionary<string, Setter>();
        private Dictionary<string, Getter> m_getters = new Dictionary<string, Getter>();
        internal void Declare(string varName, Getter getter, Setter setter = null) {
            m_getters.Add(varName, getter);
            if (setter != null) {
                m_setters.Add(varName, setter);
            }
        }

        public object Get(string varName, out Stack stack, bool allowParentChaining = true) {
            object obj = null;
            if (varName == "prototype") {
                stack = parent;
                return parent;
            }
            if (m_getters.ContainsKey(varName)) {
                stack = this;
                return m_getters[varName]();
            }
            stack = this;
            if (allowParentChaining) {
                while(!(stack is null) && !stack.m_dict.ContainsKey(varName)) {
                    stack = stack.parent;
                }
                if (stack is null) {
                    throw new KeyNotFoundException();
                }
                return stack.m_dict[varName];
            }
            try {
                obj = m_dict[varName];
            }
            catch {
                throw new KeyNotFoundException();
            }
            return obj;
        }

        public void Set(string varName, object value, bool allowParentChaining = true)
        {
            if (varName == "prototype") {
                parent = value as Stack;
                return;
            }
            if (m_setters.ContainsKey(varName)) {
                m_setters[varName](value);
                return;
            }
            if (allowParentChaining) {
                var stack = this;
                while (!(stack is null) && !stack.m_dict.ContainsKey(varName)) {
                    stack = stack.parent;
                }
                if (stack is null) {
                    throw new KeyNotFoundException();
                }
                stack.m_dict[varName] = value;
                return;
            }
            if (!m_dict.ContainsKey(varName)) {
                throw new KeyNotFoundException();
            }
            m_dict[varName] = value;
        }

        public bool Has(string varName, bool allowParentChaining = true)
        {
            if (varName == "prototype") {
                return parent != null;
            }
            if (m_getters.ContainsKey(varName)) {
                return true;
            }
            if (allowParentChaining) {
                var stack = this;
                while (!(stack is null) && !stack.m_dict.ContainsKey(varName)) {
                    stack = stack.parent;
                }
                if (stack is null) {
                    return false;
                }
                return true;
            }
            return m_dict.ContainsKey(varName);
        }

        public override string ToString() {
            // StringBuilder is more efficient
            var sb = new System.Text.StringBuilder();
            sb.AppendLine("{");
            foreach (var item in m_dict) {
                sb.AppendLine($"{item.Key} : {item.Value}");
            }
            sb.AppendLine("}");
            return sb.ToString();
        }
    }
}
