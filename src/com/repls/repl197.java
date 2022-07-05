package com.repls;

import java.util.HashSet;

/*
Create a set collection in which you do not want to preserve or sort the order and add below values to it.
Red
Pink
Yellow
White
Black
Print set collection
And get total number of colors available in the set
Expected Output:
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
 */

public class repl197 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        hashSet.add("White");
        hashSet.add("Black");

        //hashSet.forEach(System.out::println);
        System.out.println("Original Hash Set: "+hashSet);
        System.out.println("Size of Hash Set: "+hashSet.size());
    }
}
