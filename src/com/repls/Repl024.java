package com.repls;
    /*
    Write a program that takes a user's name and prints it.
    Example Output:
    Hello, please enter your name
    Your name is Sumair
     */

import java.util.Scanner;

public class Repl024 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name");
        String name=input.nextLine();
        System.out.println("your name is "+name);
    }
}
