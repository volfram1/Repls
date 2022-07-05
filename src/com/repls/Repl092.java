package com.repls;
/*
Validate if the string ends with "u" prints the boolean value accordingly.
Validate if the string ends with "world" prints the boolean value accordingly.
Validate if the string ends with "are" prints the boolean value accordingly.
Validate if the string ends with "you" prints the boolean value accordingly.
 */

public class Repl092 {
    public static void main(String[] args) {
        String s="hello how are you";

        System.out.println(s.endsWith("u"));
        System.out.println(s.endsWith("world"));
        System.out.println(s.endsWith("are"));
        System.out.println(s.endsWith("you"));

    }
}
