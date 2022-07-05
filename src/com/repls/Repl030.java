package com.repls;

    /*
    Write a program to take the month number from a user.
    Provide month name to the corresponding month number
    If a user provides any number that is out of month range, the program should display "Invalid"
    IMPORTANT: use Scanner Class
    Example Output:
    Please enter month number 1
    January
    Please enter month number 33
    Invalid
     */

import java.util.Scanner;

public class Repl030 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number");
        int month= input.nextInt();
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("not valid");
        }

    }
}
