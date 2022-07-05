package com.repls;
/*
Parent class create 4 methods with different level of access modifiers.
In each method print "I am parent public/protected/default/private method".
Override methods in child class
In Main Class create object of the child class and see which methods are available
Expected Output:
I am a child public method
I am a child protected method
I am a child default method
 */

public class Repl0165 {
    public static void main(String[] args) {
        Animals[] obj= {new Cat("Cat"),new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
        for (Animals animal: obj){
            animal.eats();
            animal.sleep();
        }
    }
}
class Animals{
    String type;

    public Animals(String type) {
        this.type = type;
    }
    void eats(){
    }
    void sleep(){
        System.out.println(type+" sleeps a lot");
    }
}
class Cat extends Animals{
    public Cat(String type) {
        super(type);
    }
    void eats(){System.out.println(type+" eats");}
}
class Kitten1 extends Cat{
    public Kitten1(String type) {
        super(type);
    }
    void eats(){System.out.println(type+" eats milk");}
}
class Kitten2 extends Cat{
    public Kitten2(String type) {
        super(type);
    }
    void eats(){System.out.println(type+" eats snacks");}
}

class Kitten3 extends Cat{

    public Kitten3(String type) {
        super(type);
    }
    void eats(){System.out.println(type+" eats everything");
    }
}
