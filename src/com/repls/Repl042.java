package com.repls;

    /*
    For you to do:
    Write a program using the switch statement
    Let us consider there are three students in the class with roll number starting from (101 to 103)
    if any number other than 101-103 are present display "Not found Student name: in Class"
    First Output: "Enter the roll number of the Child"
    case 101: if roll number is 101 print as "Student name: Ramesh"
    case 102 :if roll number is 102 print as "Student name: Mahesh"
    case 103:if roll number is 103 print as "Student name: Mukesh"
    Other than this roll number  it should print "Not found Student name: in Class"
     */

import java.util.Scanner;

public class Repl042 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("student number");
        int studentNumber= input.nextInt();
        switch (studentNumber){
            case 101:
                System.out.println("Ramesh");
                break;
            case 102:
                System.out.println("Mahesh");
                break;
            case 103:
                System.out.println("Mukesh");
                break;
            default:
                System.out.println("no student found");
        }
    }
}
