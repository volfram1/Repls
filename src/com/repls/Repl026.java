package com.repls;

    /*
    The variable "name" holds a String user input
    Write a conditional statement starting on line 9 that does the following:
    If name is equal to "Chen", print "teacher"
    For any other input, print "student"
    Examples:
    In: Chen
    teacher
    In: Faa
    student
    Hint: for your if condition use if(name.equals("Chen")) - we haven't study it yet, but this is code to compare Strings.
    We will cover this topic soon.
     */

import java.util.Scanner;

public class Repl026 {
    public static void main(String[] args) {
        String name1="Chen";
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=input.nextLine();
        if(name.equalsIgnoreCase(name1)){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }
    }
}
