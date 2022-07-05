package com.repls;

public class Repl0145Tester {
    public static void main(String[] args) {
        Repl0145 dog1=new Repl0145("Tarzan",50.0,"Mutt");
        System.out.println(dog1.dogName+" "+dog1.dogBreed+" "+dog1.dogWeight);
        Repl0145 dog2=new Repl0145("Lucy",10.0,"Mutt");
        System.out.println(dog2.dogName+" "+dog2.dogBreed+" "+dog2.dogWeight);
    }
}
