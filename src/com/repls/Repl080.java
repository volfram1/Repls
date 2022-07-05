package com.repls;
/*
Write a program to double the values of every element in the array and print it out.
Example Output:
2.8 4.0 6.6 4.0
8.0 3.0 12.2 2.0
2.4 6.2 8.0 3.2
 */

public class Repl080 {
    public static void main(String[] args) {
        double[][] array={
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };
        for (double[] a:array
             ) {
            for (double b:a
                 ) {
                System.out.print((b*2)+" ");
            }
            System.out.println();

        }
    }
}
