package com.repls;

import java.util.ArrayList;
import java.util.LinkedList;
/*
Create an Linked List that will store all prime numbers from 1 to 10
Step 1. Create a method that will identify wether number is prime or not
Step 2. Add all prime numbers into Linked List
Print Linked List:
Expected Output:
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
 */

public class Repl192Prime {

    public static void main(String[] args) {
        LinkedList<Integer> primeNumbers=new LinkedList<>();
        for (int i=1; i<=100; i++){
            if (isPrime(i)){
                primeNumbers.add(i);
            }
        }
    }

    public static boolean isPrime(int num){
        boolean isPrime = num>=2;
        for (int i=2; i<=(num/2); i++){
            if((num%i)==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }


}