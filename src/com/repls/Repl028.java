package com.repls;

    /*
    Write a program to take values of length and width from the user.
    Based on value define whether the shape is a square or rectangle.
    Examples:
    Please enter the length 18
    Please enter the width 16
    The shape of your object is rectangle
    Please enter the length 16
    Please enter the width 16
    The shape of your object is square
     */

import java.util.Scanner;

public class Repl028 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the length");
        int lenght = input.nextInt();
        System.out.println("plese enter the width");
        int width = input.nextInt();
        if(lenght==width){
            System.out.println("the shape of your object is square");
        }else{
            System.out.println("the shape of your object is rectangle");
        }
    }
}
