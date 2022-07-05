package com.repls;

/*Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
Expected Output:
265
22180
PATRICK ST
UNITED STATE
VIENNA

 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repl205 {
    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<>();
        a.put("Street", "Patrick ST");
        a.put("Suite", "265");
        a.put("City", "Vienna");
        a.put("Zip", "22180");
        a.put("Country", "United State");

        for (Map.Entry<String,String> entry:a.entrySet()
             ) {
            System.out.println(entry.getValue().toUpperCase());

        }

    }
}
