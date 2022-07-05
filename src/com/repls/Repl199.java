package com.repls;

import java.util.Iterator;
import java.util.LinkedHashSet;
/*
Create a Set collection in which you want to preserve an order of inserted String Objects.

Add the below values

null
Sohil
Diego
Alijon
Asel
Sumair
Print values 1 by 1 using loop and Iterator

null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
 */

public class Repl199 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("null");
        linkedHashSet.add("Sohil");
        linkedHashSet.add("Diego");
        linkedHashSet.add("Alijon");
        linkedHashSet.add("Asel");
        linkedHashSet.add("Sumair");

        for (String a:linkedHashSet
             ) {
            System.out.println(a);
        }
        Iterator<String> iterator= linkedHashSet.iterator();
        while (iterator.hasNext()){
            String element=iterator.next();
            System.out.println(element);
        }

    }
}
