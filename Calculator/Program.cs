using System;
using MSLib;
class Program {
    static void Main(string[] args) {
        string line;
        Machine machine = new Machine();
        System.Text.StringBuilder sb = new System.Text.StringBuilder();
        while (true) {
            line = Console.ReadLine();
            if (line == "exit") {
                break;
            }
            if (line != null) {
                sb.AppendLine(line);
            }
            else {
                try {
                    machine.Execute(sb.ToString());
                    Console.Write(machine.DumpStack());
                }
                catch (Exception ex) {
                    Console.WriteLine(ex.Message);
                }
                //machine.Execute(sb.ToString());
                //Console.Write(machine.DumpStack());
                sb.Clear();
            }
        }
    }
}