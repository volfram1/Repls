package com.repls;

/*
Create a method that will do temperature check.
Anytime user passes temperture that is below 32 method should throw an Exception saying "It is freezing"
In Main method call the method and handle an Exception
Expected Output:
java.lang.RuntimeException: It is freezing
 */

public class Repl213 {

    public static void main(String[] args) {
        int temperature = 30;
        if (temperature < 32) {
            System.out.println(new RuntimeException("It is freezing"));
        }
    }
}
