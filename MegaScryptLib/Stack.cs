using System;
using System.Collections.Generic;

namespace MSLib
{
    internal class Stack
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
            m_dict.Add(varName, value);
        }

        public object Get(string varName, bool allowParentChaining = true)
        {
            if (allowParentChaining) {
                var stack = this;
                while(!(stack is null) && !stack.m_dict.ContainsKey(varName)) {
                    stack = stack.parent;
                }
                if (stack is null) {
                    throw new KeyNotFoundException();
                }
                return stack.m_dict[varName];
            }
            return m_dict[varName];
        }

        public void Set(string varName, object value, bool allowParentChaining = true)
        {
            if (allowParentChaining) {
                var stack = this;
                while (!(stack is null) && !stack.m_dict.ContainsKey(varName)) {
                    stack = stack.parent;
                }
                if (stack is null) {
                    throw new KeyNotFoundException();
                }
                stack.m_dict[varName] = value;
            }
            else {
                if (!m_dict.ContainsKey(varName)) {
                    throw new KeyNotFoundException();
                }
                m_dict[varName] = value;
            }
        }

        public bool Has(string varName, bool allowParentChaining = true)
        {
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
            foreach (var item in m_dict) {
                sb.AppendLine($"{item.Key} = {item.Value}");
            }
            return sb.ToString();
        }
    }
}
