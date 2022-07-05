package com.repls;
    /*
    The variable "num" holds an integer input from a user
    Write a conditional statement starting on line 9 that does the following:
    If num is positive, print "__ is positive"
    If num is negative, print "__ is negative"
    If num is equals to 0, then print "Entered number is equals to 0"
    Examples:
    In: 5
    5 is positive
    In: -2
    -2 is negative
    In: 0
    Entered number is equals to 0
     */

import java.util.Scanner;

public class Repl025 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("please enter a number");
        int num= input.nextInt();
        if (num>0){
            System.out.println("number is positive");
        }else if(num<0){
            System.out.println("number is negative");
        }else{
            System.out.println("enetered number is equal to zero");
        }
    }
}
