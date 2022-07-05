package com.repls;

import java.util.Scanner;

/*
Write a program that takes user's first name and last name and prints in console
Instruct the user to enter first name: "Please Enter First Name"
Capture the first name
Instruct the user to enter last name:"Please Enter Last Name"
Capture last name
Print first name and last name
Final Output:
Example:
Please Enter First Name
Please Enter Last Name
Cindy Crawford
 */
public class Repl020 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first name");
        String firstName= input.nextLine();
        System.out.println("please enter lastname ");
        String lastName=input.nextLine();
        System.out.print(firstName+" "+lastName);


    }
}
