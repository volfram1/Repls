package com.repls;

import java.util.HashSet;
import java.util.Set;
/*
Create a Set and add below values to it.
[third, first, second]
Print HashSet and then remove all the elements from Hashset and print it again.
Expected Output:
[third, first, second]
[]
 */

public class Repl196 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("third");
        hashSet.add("first");
        hashSet.add("second");

        System.out.println(hashSet);

        HashSet<String> hashSet1=new HashSet<>();
        hashSet1.add("third");
        hashSet1.add("first");
        hashSet1.add("second");

        hashSet.removeAll(hashSet1);
        System.out.println(hashSet);

    }

}
