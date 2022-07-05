package com.repls;
/*
For you to do:
Create an instance final method that will reverse a String and return that new String
Call method from the main method
Expected Output:
olleh
 */

public class Repl0168 {

     static final String reversed(String word){
        StringBuilder stringBuilder=new StringBuilder(word);
         return stringBuilder.reverse().toString();
     }

    public static void main(String[] args) {

        System.out.println(Repl0168.reversed("Agnieszka"));

    }
}
