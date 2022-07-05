package com.repls;
/*
Create a method hello() in parent class that will print "method in Parent class"
then override that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"
In Main Class create 3 object of the child classes and store in into an array and call method hello():
Expected Output:
method in Child1 class
method in Child2 class
method in Child3 class
 */

public class Repl0164 {
    public static void main(String[] args) {

            Parent1 [] obj={new Child1(), new Child2(), new Child3()};
            for(Parent1 b:obj){
                b.hello();
            }
    }
}
class Parent1{


    void hello(){
        System.out.println("method in parent class");
    }

}
class Child1 extends Parent1{

    @Override
    void hello() {
        System.out.println("method in Child1 class");
    }
}
class Child2 extends Parent1{

    @Override
    void hello() {
        System.out.println("method in Child2 class");
    }
}
class Child3 extends Parent1{

    @Override
    void hello() {
        System.out.println("method in Child3 class");
    }
}

