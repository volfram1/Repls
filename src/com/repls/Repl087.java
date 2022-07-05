package com.repls;
/*
Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'
carColor='White'
carYear=2018
carMake='Toyota'
Expected Output:
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
 */

public class Repl087 {
    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args) {
        Repl087 car1=new Repl087();
        Repl087 car2=new Repl087();

        car1.carColor="Black";
        car1.carMake="BMW";
        car1.carYear=2019;

        car2.carColor="White";
        car2.carMake="Toyota";
        car2.carYear=2018;

        System.out.println(car1.carColor+" "+car1.carMake+" "+car1.carYear);
        System.out.println(car2.carColor+" "+car2.carMake+" "+car2.carYear);


    }
}
