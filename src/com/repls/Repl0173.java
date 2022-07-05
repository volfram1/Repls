package com.repls;
/*
Create a Super Class Tea that will have:
instance variable teaType;
constructor that will initialize
unimplemented method addSugar(),
Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
In main class create an object of 2 Child and assign them to Parent reference type.
Execute method addSugar from both classes.
Expected Output:
For Lemon Tea we need 2 spoons of sugar
 */

public abstract class Repl0173 {
    String teaType;

    public Repl0173(String teaType) {
        this.teaType = teaType;
    }
    abstract void addSugar();

    public static void main(String[] args) {
        Repl0173 repl0173=new LemonTea("Lemon Tea");
        Repl0173 repl01731=new ChaiTea("Chai tea");
        repl0173.addSugar();
        repl01731.addSugar();
    }
}
class LemonTea extends Repl0173{

    public LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends Repl0173{
    public ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 1 spoon of sugar");

    }
}
