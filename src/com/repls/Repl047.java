package com.repls;
    /*
    For you to do:
    Using while loop print numbers from 15 to 0
    **Example Output:**
    15
    14
    13
    12
    11
    10
    9
    8
    7
    6
    5
    4
    3
    2
    1
    0
     */

public class Repl047 {
    public static void main(String[] args) {
        int i = 15;
        while(i>=0){
            System.out.println(i);
            i--;
        }
    }
}
