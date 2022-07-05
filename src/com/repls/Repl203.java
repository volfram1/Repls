package com.repls;
/*
Create HashMap
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
map.put("mango", 40);
map.put("mango", 40);
Using iterator retrieve all keys and values if the format below:
Expected Output:
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Repl203 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("mango",10);
        hashMap.put("apple",30);
        hashMap.put("orange",20);
        hashMap.put("mango",40);
        hashMap.put("mango",40);

        Iterator<Map.Entry<String,Integer>> iterator=hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry= iterator.next();
            System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
        }
    }
}
