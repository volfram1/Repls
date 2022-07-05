package com.repls;
/*
Write a program that prints the highest value in the array.
Expected Output: input [5,4,8]
8
 */

public class Repl081 {
    public static void main(String[] args) {
        int[] array={3,5,8};
        int maxNum=array[0];
        for(int i=0; i< array.length; i++){
            if (array[i]>maxNum){
                maxNum=array[i];
            }

        }
        System.out.println(maxNum);
    }
}
