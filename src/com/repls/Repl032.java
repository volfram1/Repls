package com.repls;

    /*
    For you to do:
    Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"
    You have 2 conditions:
    If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
    If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"
    Example Output:
    Please enter your gender: M or F
    Please enter your age
    Man
    Example Output:
    Please enter your gender: M or F
    Please enter your age
    Boy
    Example Output:
    Please enter your gender: M or F
    Please enter your age
    Woman
    Example Output:
    Please enter your gender: M or F
    Please enter your age
    Girl
     */

import java.util.Scanner;

public class Repl032 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your gender");
        String gender=input.nextLine();
        System.out.println("enter age");
        int age=input.nextInt();
        if (age>25){
            if (gender.equalsIgnoreCase("F")){
                System.out.println("Woman");
            }else if (gender.equalsIgnoreCase("M")){
                System.out.println("Man");
            }else {
                System.out.println("unknown");
            }
        }else{
            if (gender.equalsIgnoreCase("F")){
                System.out.println("girl");
            }else if(gender.equalsIgnoreCase("M")){
                System.out.println("boy");
            }else{
                System.out.println("unknown");
            }
        }

    }
}
