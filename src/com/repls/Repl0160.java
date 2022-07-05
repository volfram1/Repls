package com.repls;
/*
Overload instance method display by having different types of parameters
Inside each method write the logic to print value of the parameter
Call all methods inside your main method
Expected Output:
100
Syntax Technologies
100.09
 */

public class Repl0160 {
    void display(int a){
        System.out.println(a);
    }
    void display(String b){
        System.out.println(b);
    }
    void display(double c){
        System.out.println(c);
    }

    public static void main(String[] args) {
        Repl0160 repl0160=new Repl0160();
        repl0160.display(100);
        repl0160.display("Syntax Technologies");
        repl0160.display(100.09);
    }
}
