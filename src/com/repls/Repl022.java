package com.repls;
    /*
    Write a program to take user name, age and mobile number
    First Output: "Enter your name"
    Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
    Third Output: "Enter your age"
    Example Output:
    Enter your name
    Enter your mobile number
    Enter your age
    Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
     */

import java.util.Scanner;

public class Repl022 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name");
        String name= input.nextLine();
        System.out.println("enter your mobile number");
        String number= input.nextLine();
        System.out.println("enter your age");
        int age= input.nextInt();
        System.out.println("your mane is "+name+" your age is "+age+" and your mobile number is "+number);
    }
}
