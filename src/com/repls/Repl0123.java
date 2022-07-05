package com.repls;

    /*
    Declare the instance variables to hold:
    integer values
    String values
    double values
    boolean values
    float values
    Access instance variables and then print them all without assigning any values to them.
    Print variables one by one the same sequence that you declare them.
    Expected Output:
    0
    null
    0.0
    false
    0.0
     */

public class Repl0123 {
    int num;
    String word;
    double dB;
    boolean bool;
    float floo;

    void print(){
        System.out.println(num);
        System.out.println(word);
        System.out.println(dB);
        System.out.println(bool);
        System.out.println(floo);


    }

    public static void main(String[] args) {
        Repl0123 p=new Repl0123();
        p.print();
    }


}
