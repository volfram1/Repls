package com.repls;
/*
Write a program that creates a String array with size 7.
Ask the user to input Days of a week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array
Example:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday etc
Example Output:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday
Please enter day 4 of the week
Wednesday
Please enter day 5 of the week
Thursday
Please enter day 6 of the week
Friday
Please enter day 7 of the week
Saturday
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
 */

import java.util.Scanner;

public class Repl076 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] array=new String[7];
        for (int i=0; i<array.length; i++){
            System.out.println("please enter a "+(i+1)+" day of the week");
            array[i]= input.nextLine();
        }
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
