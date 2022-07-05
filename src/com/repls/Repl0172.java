package com.repls;
/*
Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
Make Main class to be a derived class from Parent.
In main method execute both methods
Expected Output:
Child class providing implementation
Parent class providing implementation
 */

public class Repl0172 extends Parent3{
    @Override
    void m1() {
        System.out.println("Child class providing implementation");
    }

    public static void main(String[] args) {
        Repl0172 repl0172=new Repl0172();
        repl0172.m1();
        repl0172.m2();
    }
}
abstract class Parent3{
    abstract void m1();
    void m2(){
        System.out.println("Parent class providing implementation");
    }
}
