package com.repls;
/*
Overload 2 final instance methods:
Call them in main method
Expected Output:
Final method with boolean parameter
Final method with String parameter
 */

public class Repl0170 {
 final void  method1(String a){
     System.out.println("Final method with " +a+" parameter");
 }
 final void method1(){
     System.out.println("Final method with boolean parameter");
 }

    public static void main(String[] args) {
        Repl0170 repl0170=new Repl0170();
        repl0170.method1();
        repl0170.method1("String");

    }

}
