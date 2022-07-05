package com.repls;
/*
Given the following inputs:

int x;
Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.

Sample input/outputs:

In: 7
6 5 4 3 2 1 0
In: 12
11 10 9 8 7 6 5 4 3 2 1 0
In: 20
19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
 */

import java.util.Scanner;

public class Repl065 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        for(int i=num-1; i>=0; i-- ){
            System.out.print(i+" ");
        }
    }
}
