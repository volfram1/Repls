package com.repls;

    /*
    Create an arrayList of type Integer.
    add below values.
    111
    111
    111
    999
    999
    999
    Print all the values of List 1 by 1:
    Expected Output:
    111
    111
    111
    999
    999
    999
     */

import java.util.ArrayList;

public class Repl185 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(111);
        arrayList.add(111);
        arrayList.add(111);
        arrayList.add(999);
        arrayList.add(999);
        arrayList.add(999);

        for (Integer num:arrayList
             ) {
            System.out.println(num);

        }

    }
}
