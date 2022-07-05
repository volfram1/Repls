package com.repls;
/*
Overload static method and then execute both overloaded methods.
Expected Output:
static method without parameter
static method with int parameter
 */

public class Repl0162 {
    static void m(){
        System.out.println("static method without parameter");
    }
    static void m(int a){
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        m();
        m(10);
    }
}
