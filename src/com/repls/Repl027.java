package com.repls;

    /*
    Write a Java program to ask age "Please enter your age".
    Based on the age define whether the user is eligible to vote or not.
    A person who is eligible to vote must be older or equal to 18 years old and the program will show "You are eligible to vote".
    Otherwise, the program will show "You are not eligible to vote".
    Examples:
    Please enter your age 18
    You are eligible to vote
    Please enter your age 16
    You are not eligible to vote
     */

import java.util.Scanner;

public class Repl027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible");
        }
    }
}
