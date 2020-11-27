using System;

namespace Hello
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Hello,");

            if (args.Length > 0)
                for (int i = 0; i < args.Length; ++i)
                    Console.Write(" {0}", char.ToUpper(args[i][0]) + args[i].Substring(1));
            else
                Console.Write(" World");

            Console.WriteLine("!");
        }
    }
}
