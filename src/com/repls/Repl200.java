package com.repls;

/*
Create A Map that will preserve an order of entry objects
Add below pairs :
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values of from the map
Expected Output:
Patrick ST
265
Vienna
22180
United State
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repl200 {

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
