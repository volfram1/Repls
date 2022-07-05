package com.repls;
    /*
    For you to do:
    Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
    and make the comparisons:
    if int1 and int2 are equal and word1 and word2 are equal, output "AND"
    if int1 and int2 are equal or word1 and word2 are equal, output "OR"
    if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
    **Example input/output:**
    word1: banana
    word2: banana
    int1: 2
    int2: 2
    Output: AND
    word1: banana
    word2: apple
    int1: 2
    int2: 2
    Output: OR
    word1: phone
    word2: pie
    int1: 2
    int2: 3
    Output: NONE
     */

import java.util.Scanner;

public class Repl036 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter two words");
        String word1= input.nextLine();
        String word2=input.nextLine();
        System.out.println("please enter two numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();
        if(num1==num2&&word1.equalsIgnoreCase(word2)){
            System.out.println("and");
        }else if(num1==num2 || word1.equalsIgnoreCase(word2)){
            System.out.println("or");
        }else if(num1!=num2 && !word1.equalsIgnoreCase(word2)){
            System.out.println("none");
        }
    }
}
