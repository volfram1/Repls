package com.repls;

public class Repl0143Tester {
    public static void main(String[] args) {


        Repl0143 c1 = new Repl0143("Toyota", "Prius", 4, "120", 30000.0);
        c1.display();
        Repl0143 c2=new Repl0143("Toyota", "Prius", "120",30000.0);
        c2.display();
        Repl0143 c3=new Repl0143(4,"120",30000.0);
        c3.display();
        Repl0143 c4=new Repl0143("Toyota", "Prius", 4);
        c4.display();

    }
}
