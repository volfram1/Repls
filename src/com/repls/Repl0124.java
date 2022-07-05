package com.repls;

    /*
    Declare static variable in class level as below and assign its value:
    String ss="Welcome To Syntax Technologies"
    Access variable in the main method and print it using three ways you learned so far
    Hint:
    first way: By calling directly
    Second way: By using the className
    Third way: By creating the object of the class
    Expected Output:
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
     */

public class Repl0124 {

    static String ss="Welcome To Syntax Technologies";

    void print(){
        System.out.println(ss);
    }


    public static void main(String[] args) {
        System.out.println(ss);
        System.out.println(Repl0124.ss);

        Repl0124 p=new Repl0124();
        p.print();
    }
}
