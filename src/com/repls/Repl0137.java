package com.repls;
    /*
    In main class please declared the variables using different access modifiers that will hold value for:
    name
    city
    name of the school
    batch number
    Create a method to display details in following format:
    My name is ___ and I live in ___. I study at ___ in batch ___
    Assign values to the variables and execute method display
    Expected Output:
    My name is John and I live in Miami. I study at Syntax in batch 9
     */

public class Repl0137 {
    String name;
    public String city;
    private String nameOfTheSchool;
    protected int batchNumber;

    void display(){
        System.out.println("My name is "+name+" and i live in "+city+". I study at "+nameOfTheSchool+" in batch "+batchNumber);
    }

    public static void main(String[] args) {
        Repl0137 sentence=new Repl0137();
        sentence.name="John";
        sentence.city="Miami";
        sentence.nameOfTheSchool="Syntax";
        sentence.batchNumber=9;
        sentence.display();
    }

}
