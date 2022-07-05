package com.repls;
    /*
    For you to do:
    Create a program that prompt user with question: "Do you need a loan?"(Use a boolean)
    If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
    Based on the score define users eligibility:
    if score is below 600 --> eligibility = "Not eligible"
    if score is between 600 and 700 inclusive --> eligibility = "Maybe eligible"
    if score is between 701 and 800 inclusive --> eligibility = "Eligible"
    if score is higher than any other previous values --> eligibility = "Definitely eligible" .
    Output:
    The eligibility is ____
     */

import java.util.Scanner;

public class Repl035 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("do you need a loan?");
        boolean needLoan= input.nextBoolean();
        if(needLoan){
            System.out.println("what is your score?");
            int score= input.nextInt();
            if(score<600){
                System.out.println("not eligible");
            }else if(score>=600 && score<700){
                System.out.println("maybe eligible");
            }else if(score>=700 && score<800){
                System.out.println("eligible");
            }else {
                System.out.println("definitely eligible");
            }
        }else{
            System.out.println("unknown");
        }
    }
}
