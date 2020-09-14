using System;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace MegaScrypt {
    public class Array : Stack, IEnumerable<object> {
        private List<object> m_list;

        public Array() {
            m_list = new List<object>();
            BindFunctions();
        }

        public Array(IEnumerable<object> enumerable) {
            m_list = enumerable.ToList();
            BindFunctions();
        }
        // TODO: Implement with the inherited interface: Stask.Get/Stack.Set
        public object this[int i] {
            get => m_list[i];
            set => m_list[i] = value;
        }

        private void BindFunctions() {
            Declare(Add);
            Declare(AddRange);
            Declare(Insert);
            Declare(RemoveAt);
            Declare(Clear);
            Declare("Count", () => m_list.Count);
        }

        public object Add(List<object> list) {
            m_list.Add(list[0]);
            return null;
        }

        public object AddRange(List<object> list) {
            var array = list[0] as Array;
            m_list.AddRange(array.m_list);
            return null;
        }

        public object Insert(List<object> list) {
            int index = (int)list[0];
            object obj = list[1];
            m_list.Insert(index, obj);
            return null;
        }

        public object RemoveAt(List<object> list) {
            int index = (int)list[0];
            m_list.RemoveAt(index);
            return null;
        }

        public object Clear(List<object> list) {
            m_list.Clear();
            return null;
        }

        public IEnumerator<object> GetEnumerator() {
            throw new NotImplementedException();
        }

        IEnumerator IEnumerable.GetEnumerator() {
            throw new NotImplementedException();
        }
    }
}
