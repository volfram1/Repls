package com.repls;
    /*
    For you to do:
    Write a program to input number "Input a number between 1-12" and when you input a number
    it should display the month using Scanner and Switch statement.
    case: 1 will display January
    case: 12 will display December
    Anything outside 12 will display "Invalid"
    Example Output:
    Input a number between 1-12
    Invalid
    Example Output:
    Input a number between 1-12
    January
     */

import java.util.Scanner;

public class Repl043 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number between 1-12");
        int num= input.nextInt();
        String month;
        switch(num){
            case 1:
               month="January";
                break;
            case 2:
               month="Feb";
                break;
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="June";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="Sep";
                break;
            case 10:
                month="oct";
                break;
            case 11:
               month="nov";
                break;
            case 12:
                month="dec";
                break;
            default:
               month="invalid";

        }
        System.out.println(month);
    }
}
