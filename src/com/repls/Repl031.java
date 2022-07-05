package com.repls;
/*
For you to do:
Declare boolean variable isSunny, ask the user "Is it sunny outside?"
Declare int temperature and ask user "What is the temperature outside?"
Your program should check:
If the weather is sunny output should be "It is a sunny day, I should go somewhere!"
If it is not sunny output should be "I stay home and practice Java"
If the weather is sunny you want to check the temperature "What is the temperature outside?"
If the temperature is higher than 85 then "I am going to the beach"
otherwise, "I am going to the park"
Example Output:
Is it sunny outside?
It is a sunny day, I should go somewhere!
What is the temperature outside?
I am going to the beach!
Example Output:
Is it sunny outside?
I stay home and practice Java!
Example Output:
Is it sunny outside?
It is a sunny day, I should go somewhere!
What is the temperature outside?
I am going to the park!
 */

import java.util.Scanner;

public class Repl031 {
    public static void main(String[] args) {
        boolean isSunny;
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Is it sunny? enter true or false");
        isSunny=input.nextBoolean();
        if(isSunny){
            System.out.println("go somewhere");
            System.out.println("please enter the temp");
            temp=input.nextInt();
            if(temp>85){
                System.out.println("beach");
            }else {
                System.out.println("park");
            }
        }else{
            System.out.println("stay home");
        }


    }
}
