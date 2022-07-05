package com.repls;
/*
Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi
Extract all keys and it values and print them in the format below:
Expected Output:
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
 */

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Repl202 {
    public static void main(String[] args) {
        TreeMap<String,String> produce=new TreeMap<>();
        produce.put("1 item","apple");
        produce.put("2 item","banana");
        produce.put("3 item","pear");
        produce.put("4 item","tomato");
        produce.put("5 item","mango");
        produce.put("6 item","kiwi");

        Iterator<Map.Entry<String,String>> iterator=produce.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println("Key is "+entry.getKey()+" and values is "+entry.getValue());
        }


    }
}
