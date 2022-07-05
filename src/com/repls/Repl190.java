package com.repls;

import java.util.LinkedList;
/*
Create Linked List that will store first 10 numbers of fibonacci series
Print number from Linked List 1 by 1 all in 1 line
Expected Output:
0 1 1 2 3 5 8 13 21 34
 */

public class Repl190 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        for (int i = 1; i <=8 ; i++) {
            linkedList.add(linkedList.get(i)+linkedList.get(i-1));
        }
        for (Integer a:linkedList
             ) {
            System.out.print(a+" ");
        }


    }
}
