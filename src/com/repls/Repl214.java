package com.repls;

/*
Create a custom Exception class
In main class create a method that will check students grade
if students grade is >90 then below exception should be thrown
if students grade is below 90 print "You are a great student"
In main method calls method gradeCheck and handle an Exception
Expected Output:
SyntaxStudentException: You are an exceptionally awesome student
 */

public class Repl214 {

    public static void main(String[] args) {
        int grade = 95;
        if(grade<90){
            System.out.println(new StudentException("You are a good student"));
        }else{
            System.out.println(new StudentException("You are a good student"));
        }
    }

    static class StudentException extends RuntimeException {
        StudentException(String errMessage){
            super(errMessage);
        }
    }
}
