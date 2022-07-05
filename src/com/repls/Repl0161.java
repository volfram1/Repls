package com.repls;
/*
Overload private instance method m1
Call each method from the main method.
Expected Output:
private m1 method
private m1 method with int parameter
 */

public class Repl0161 {

    private void m1(String a){
        System.out.println("private m1 method ");

    }
    private void m1(int a){
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {
        Repl0161 repl0161=new Repl0161();
        repl0161.m1("a");
        repl0161.m1(10);
    }
}
