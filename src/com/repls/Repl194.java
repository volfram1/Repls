package com.repls;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Create a method that will remove an element based on the specified condition from given List and return new List;
Expected Output:
[USA, Kazakhstan, Pakistan, Russia]
 */

public class Repl194 {

    public static List<String> a(){


        return null;
    }

    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        countries.removeIf(s -> s.startsWith("A"));
        System.out.println(countries);

        /*
         Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
         */
    }
}
