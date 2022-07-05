package com.repls;

public class Repl0144Tester {
    public static void main(String[] args) {
        Repl0144 store1=new Repl0144("Eggs",3.0,"Produce",true, 10);
        store1.display();
        Repl0144 store2=new Repl0144("Paper Towels", 2.0,24);
        store2.display();
        Repl0144 store3=new Repl0144("Paper Towels",2.0);
        store3.display();
    }
}
