using System;
using MSLib;
class Program {
    static void Main(string[] args) {
        string line;
        Machine machine = new Machine();
        while (!String.IsNullOrEmpty(line = Console.ReadLine())) {
            var result = machine.Execute(line);
            Console.Write(machine.DumpStack());
        }
    }
}