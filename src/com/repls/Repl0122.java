package com.repls;

    /*
    For you to do:
    Declare 3 instance variables to hold:
    name of the country
    capital
    population size
    Create a method to display values of instance variables
    Create 2 Object, assign values to instance variables, execute method display;
    Expected Output:
    The capital of USA is Washington DC and population is 330000000
    The capital of Kazakhstan is Astana and population is 18500000
     */

public class Repl0122 {
    String countryName;
    String countryCapital;
    int population;

    void display(){
        System.out.println("The capital of "+countryName+" is "+countryCapital+" and population is "+population);
    }

    public static void main(String[] args) {
        Repl0122 p1=new Repl0122();
        p1.countryName="USA";
        p1.countryCapital="Washington DC";
        p1.population=330000000;

        Repl0122 p2=new Repl0122();
        p2.countryName="Kazakhstan";
        p2.countryCapital="Astana";
        p2.population=18500000;

        p1.display();
        p2.display();
    }
}
