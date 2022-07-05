package com.repls;
/*
Write a program that creates an array with the following values{s, a, y, b, n, c, t, d, a, e, x}

Print the values so the output should look like below

**Output:**
syntax

 */

public class Repl072 {
    public static void main(String[] args) {
        char[] array={'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
        for (int i=0; i< array.length; i+=2){
            System.out.print(array[i]);
        }
    }
}
