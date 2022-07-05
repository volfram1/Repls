package com.repls;
/*
Write a program to print out the pattern:

Expected output:

$$$$
$  $
$  $
$$$$
 */

public class Repl068 {
    public static void main(String[] args) {
        char a='$';
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                if((i==2&&j==2)||(i==2&&j==3)||(i==3&&j==2)||(i==3&&j==3)){
                    System.out.print(" ");
                }else {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }
}
