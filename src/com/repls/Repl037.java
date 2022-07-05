package com.repls;

    /*
    For you to do:
    Take 2 boolean inputs from a user:
    "Are you thirsty?"
    "Are you sleepy?"
    If user is thirsty and not sleepy--> drink=water
    If user is thirsty and sleepy--> drink=coffee
    If user is not thirsty and sleepy --> drink=tea
    Otherwise drink="nothing"
    Output:
    Looks like you need to drink ___
     */

import java.util.Scanner;

public class Repl037 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("are you thirsty");
        boolean isThirsty= input.nextBoolean();
        System.out.println("are you sleepy");
        boolean isSleepy= input.nextBoolean();
        if(isThirsty&&!isSleepy){
            System.out.println("drink water");
        }else if(isSleepy&&isSleepy) {
            System.out.println("drink coffee");
        }
        else if(!isThirsty&&isSleepy){
            System.out.println("drink tea");
        }else{
            System.out.println("drink nothing");
        }
    }
}
