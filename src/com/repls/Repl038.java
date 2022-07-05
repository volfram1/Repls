package com.repls;

/*
For you to do:
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
Output:
Today you will be learning ____
 */

import java.util.Scanner;

public class Repl038 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("is it weekend?");
        boolean isWeekend= input.nextBoolean();
        if(isWeekend){
            System.out.println("java");
        }else{
            System.out.println("mannual testing");
        }
    }
}
