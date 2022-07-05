package com.repls;
/*
Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers
For example, if we run rowSums for the following 2D array:
{
{1,1,2}, //sum = 4
{3,1,2}, //sum = 6
{3,5,3}, //sum = 11
{0,1,2}  //sum = 3
}
Then we should get the following array back:
4
6
11
3
 */

public class Repl083 {
    public static void main(String[] args) {
        int[][] array={
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int[] arr=new int[array.length];
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum= sum+array[i][j];
            }
            arr[i]=sum;
            System.out.println(arr[i]);
        }
    }
}
