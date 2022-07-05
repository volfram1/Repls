package com.repls;
/*
Create a Method in Main class using below specification.
Method Name: Display.
Return Type: Void
Parameters : Map<String,Integer>
Logic:
First the method will check the given map is empty or not.
If the map is not empty print pairs of key and value using loops
If map is empty simply print "map is empty"
NOW IN MAIN METHOD
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
using created display method to display.
then clear the map.
use the same method to display
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Repl208 {

    public void display(Map<String,Integer> map){
        if (map.isEmpty()){
            System.out.println("map is empty");
        }else{
            for (Map.Entry<String,Integer> a:map.entrySet()
                 ) {
                System.out.println(a);
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("mango",10);
        map.put("apple",30);
        map.put("orange",20);

        Repl208 repl208=new Repl208();
        repl208.display(map);
        map.clear();
        repl208.display(map);




    }
}

