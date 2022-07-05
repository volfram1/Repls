package com.repls;
/*
For you to do:
Ask the user to enter any number
if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd" and prints Odd value is just right
If the number is even then check if it is greater than 1000 or not.
If the number is greater than 1000, then print "Even value is large", else print "Even value is just right".
Example Output:
Please enter a number
Value is odd
Example Output:
Please enter a number
Value is odd
Odd value is just right
Example Output:
Please enter a number
Value is even
Even value is large
 */

import java.util.Scanner;

public class Repl033 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please proviede a number");
        int num= input.nextInt();
        if(num%2==0){
            System.out.println("the number is even");
            if(num<1000){
                System.out.println("the number is just right");
            }else{
                System.out.println("even number is large");
            }
        }else{
            System.out.println("the number is odd");
            if (num<1000){
                System.out.println("the number is just right");
            }else{
                System.out.println("the number is large");
            }
        }
    }
}
