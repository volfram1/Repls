package com.repls;
/*
Create a program that will ask a user to input boolean value "Input the boolean
value"
If the input is true or false, then the output should look like below:
Example Output:
Input the boolean value
The value is true
Example Output:
Input the boolean value
The value is false
 */

import java.util.Scanner;

public class Repl023 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input the boolean value");
        boolean value=input.nextBoolean();
        if (value) {
            System.out.println("the value is " + value);
        }else{
            System.out.println("the value is "+ value);
        }
    }
}
