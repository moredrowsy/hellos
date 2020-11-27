package com.moredrowsy.hello;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.print("Hello,");

        if (args.length > 0) for (int i = 0; i < args.length; ++i)
            System.out.format(" %s", args[i].substring(0, 1).toUpperCase() + args[i].substring(1));
        else System.out.print(" World");

        System.out.println("!");
    }
}

