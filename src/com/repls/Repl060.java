package com.repls;
/*
Write a program that prints the count down from 10 up to 1 and then says "Happy New Year!".
 */

public class Repl060 {
    public static void main(String[] args) {
        for(int i = 10; i>=1; i--){
            System.out.println(i);
            if(i==1){
                System.out.println("Happy new year");
            }
        }
    }
}
