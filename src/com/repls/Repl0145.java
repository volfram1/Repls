package com.repls;
/*
Complete the Dog.java class:
Create following class variables.
dogName
dogWeight
static dogBreed=Mutt;
For all methods and variables use proper naming convention.
Create constructor to initialize instance variables
In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.
Expected Output:
Tarzan Mutt 50.0
Lucy Mutt 10.0
 */

public class Repl0145 {
    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    public Repl0145(String dogName, double dogWeight,String dogBreed) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
        dogBreed=dogBreed;
    }


}
