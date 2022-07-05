package com.repls;
    /*
    Declare a static variable number that will hold an integer value:
    Access number from the main method and assign value to it.
    Create an Object of the class, access number in a nonstatic way and assing value of 200.
    Print out number using class name and using instance
    Expected Output:
    200
    200
     */

public class Repl0125 {
    static int number;

    void print(){
        number=200;
        System.out.println(number);
    }

    public static void main(String[] args) {
        number=200;
        System.out.println(Repl0125.number);

        Repl0125 p=new Repl0125();
        p.number=200;
        System.out.println(p.number);
    }
}

