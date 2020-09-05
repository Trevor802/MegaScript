using System;
using MSLib;
class Program {
    static void Main(string[] args) {
        string line;
        Calculator calculator = new Calculator();
        while (!String.IsNullOrEmpty(line = Console.ReadLine())) {
            var result = calculator.Evaluate(line);
            Console.WriteLine($"{line} = {result}");
        }
    }
}