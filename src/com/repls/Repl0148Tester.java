package com.repls;

public class Repl0148Tester {

    public static void main(String[] args) {
        double item1Price;
        double item2price;
        double total;
        Repl0148 obj1=new Repl0148("Blanket",99.98,1);
        System.out.println(obj1.item+" Total Value " +obj1.itemTotalPrice());
        item1Price=(obj1.itemTotalPrice());
        Repl0148 obj2=new Repl0148("Mattress",439.18,1);
        System.out.println(obj2.item+" Total Value " +obj2.itemTotalPrice());
        item2price=(obj2.itemTotalPrice());
        total= obj1.itemTotalPrice()+ obj2.itemTotalPrice();

        System.out.println("You purchased "+total+" Today");

    }
}
