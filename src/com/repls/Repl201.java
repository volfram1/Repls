package com.repls;
/*
Create a Map in which you do not need to preserve the order of the entries
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Find how many entries are inside the map
Remove all entires from the Map
Find the Map size again
Expected Output:
5
0
 */

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Repl201 {
    public static void main(String[] args) {
        HashMap<String,String> a=new HashMap<>();
        a.put("Street","Patrick ST");
        a.put("Suite","265");
        a.put("City","Vienna");
        a.put("Zip","22180");
        a.put("Country","United State");

        System.out.println(a.size());
        a.clear();
        System.out.println(a.size());
    }
}
