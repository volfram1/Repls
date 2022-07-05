package com.repls;
    /*
    Write a program that asks the user's age: "Enter your age "
    Then display it by adding 10 (i.e age + 10) in your final output.
    Example Output:
    Enter your age 30
    Your age after 10 years is 40
     */

import java.util.Scanner;

public class Repl021 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age");
        int age= input.nextInt();
        System.out.println(age+10);

    }
}
