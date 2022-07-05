package com.repls;

/*
Write a java program that prints out true if ( x y ) returns a positive value. Else prints out false if (x y) returns a negative value.
Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number" - for the 2nd number.
Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
If the result of a multiplication is positive print true, otherwise print false.
Example Output:
Please enter first number
Please enter second number
true

Example Output:
Please enter first number
Please enter second number
false
IMPORTANT: Must use a Scanner class
 */

import java.util.Scanner;

public class Repl029 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1= input.nextInt();
        System.out.println("please enter the second number");
        int num2= input.nextInt();
        int sum=num1*num2;
        if(sum<0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
