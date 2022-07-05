package com.repls;
    /*
    For you to do:
    declare 3 instance variables to hold an integer, double and char values.
    Create 2 instances of the class and assign values to variables and the print them
    Expected Output:
    10
    10.23
    a
    100
    100.23
    s
     */

public class Repl0121 {
    int numCal;
    double numDzie;
    char letter;

   public void info(){
        System.out.println(numCal);
        System.out.println(numDzie);
       System.out.println(letter);
    }

    public static void main(String[] args) {
        Repl0121 p=new Repl0121();
        p.numCal=10;
        p.numDzie=10.23;
        p.letter='a';

        Repl0121 p2=new Repl0121();
        p2.numCal=100;
        p2.numDzie=100.23;
        p2.letter='s';

        p.info();
        p2.info();
    }
}
