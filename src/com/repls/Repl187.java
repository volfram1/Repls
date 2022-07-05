package com.repls;

    /*
    Create an array list to type String.
    Add these values below to your arraylist
    hi
    yo
    sup
    yolo
    boop
    Remove 1, 3, 5 element from an array
    print remained values one by one in one line
    Expected Output:
    yo yolo
     */

import java.util.ArrayList;

public class Repl187 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("yo");
        arrayList.add("sup");
        arrayList.add("yolo");
        arrayList.add("boop");

       ArrayList<String> remove=new ArrayList<>();
       remove.add("hi");
       remove.add("sup");
       remove.add("boop");

       arrayList.removeAll(remove);
        for (String a:arrayList
             ) {
            System.out.print(a+" ");

        }
    }
}
