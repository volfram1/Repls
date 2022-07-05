package com.repls;
    /*
    Create a variable that will hold the count of all instances of the Main class
    Create 3 Object of the class and print value of the count variable;
    Expected Output:
    3
     */

public class Repl0126 {
    public static int count;
    public Repl0126(){
        count++;
    }

    public static void main(String[] args) {
        Repl0126 p=new Repl0126();
        Repl0126 p2=new Repl0126();
        Repl0126 p3=new Repl0126();

        System.out.println(Repl0126.count);
    }
    
    

}
