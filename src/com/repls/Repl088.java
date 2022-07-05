package com.repls;
/*
Create a Class Main
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
 */

public class Repl088 {

    String breed;
    String name;
    String color;

    public void bark(){
        System.out.println(breed+" can bark");
    }

    public void run(){
        System.out.println(breed+" can run");
    }

    public void play(){
        System.out.println(breed+" can play");
    }

    public static void main(String[] args) {
        Repl088 dog1=new Repl088();
        Repl088 dog2=new Repl088();
        Repl088 dog3=new Repl088();

        dog1.breed="Husky";
        dog1.bark();
        dog1.run();
        dog1.play();

        dog2.breed="Bulldog";
        dog2.bark();
        dog2.run();
        dog2.play();

        dog3.breed="Labrador";
        dog3.bark();
        dog3.run();
        dog3.play();



    }
}
