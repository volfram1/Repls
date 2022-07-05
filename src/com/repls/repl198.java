package com.repls;

import java.util.TreeSet;
/*
Create Set to store String Objects and you want them to be stored in ascending order
Please add the below values and see the result
"India"
"Australia"
"South Africa"
"India"
"America"
"America"
Print the Set.
Expected Output:
[America, Australia, India, South Africa]
 */

public class repl198 {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("India");
        treeSet.add("Australia");
        treeSet.add("South Africa");
        treeSet.add("India");
        treeSet.add("America");
        treeSet.add("America");

        System.out.println(treeSet);
    }
}
