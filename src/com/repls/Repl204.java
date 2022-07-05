package com.repls;

/*
Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
 */

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repl204 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> a=new LinkedHashMap<>();
        a.put("Street","Patrick ST");
        a.put("Suite","265");
        a.put("City","Vienna");
        a.put("Zip","22180");
        a.put("Country","United State");

        Iterator<Map.Entry<String,String>> iterator=a.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getValue());
        }

    }
}
