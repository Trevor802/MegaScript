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
        // TODO: Implement with C# reflection [BindMethod]
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
            return new ArrayEnum(m_list);
        }

        IEnumerator IEnumerable.GetEnumerator() {
            return GetEnumerator();
        }
    }

    public class ArrayEnum : IEnumerator<object> {
        private List<object> m_list;
        private int m_position = -1;

        public ArrayEnum(List<object> list) {
            this.m_list = list;
        }

        object IEnumerator.Current => m_list[m_position];

        public object Current {
            get {
                try {
                    return m_list[m_position];
                }
                catch (IndexOutOfRangeException){
                    throw new InvalidOperationException();
                }
            }
        }

        public void Dispose() {
            throw new NotImplementedException();
        }

        public bool MoveNext() {
            m_position++;
            return m_position < m_list.Count;
        }

        public void Reset() {
            m_position = -1;
        }
    }
}
