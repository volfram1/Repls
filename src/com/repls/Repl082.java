package com.repls;
/*
Write a program that will print the sum of all elements in 2D array.
Expected Output:
-9
 */

public class Repl082 {
    public static void main(String[] args) {
        int[][] array={
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum=sum+array[i][j];

            }
        }
        System.out.println(sum);
    }
}
