package com.repls;
/*
Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order.
Example:
Input:
1
2
3
4
5
Output:
5
4
3
2
1
 */

import java.util.Scanner;

public class Repl077 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
