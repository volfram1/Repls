package com.repls;
/*
Using Scanner class input string value.
Print out the following: "The first 3 letters of ___ is ___"
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
 */

import java.util.Scanner;

public class Repl095 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word= input.next();
        System.out.println("The first 3 letters of string are "+word.substring(0,3));
    }
}
