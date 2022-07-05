package com.repls;
/*
Create a Parent Class that will have two overloaded abstract methods m1
Make Main class as concrete subclass to Parent Class
In main method call the methods.
Expected Output:
m1 without parameters
m1 method with parameter
 */

public class Repl0171 extends Parent2{
    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(String a) {
        System.out.println("m1 method with parameter");
    }

    public static void main(String[] args) {
        Repl0171 repl0171=new Repl0171();
        repl0171.m1();
        repl0171.m1(" ");
    }
}
abstract class Parent2{
    abstract void m1();
    abstract void m1(String a);

}

