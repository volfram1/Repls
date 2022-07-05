package com.repls;

import java.security.KeyStore;
import java.util.*;

/*public class repl209Anusha {
    public static void main(String[] args) {
        List<Map<String, Object>> myList = new ArrayList<>();
        Map<String, Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);
        myList.add(appleMap);
        Map<String, Object> orangeMap = new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);
        myList.add(orangeMap);
        double total=0.0;
        for (Map<String, Object> myMap : myList) {
            Set mapSet = myMap.entrySet();
            Iterator mapIt = mapSet.iterator();
            while (mapIt.hasNext()) {
                KeyStore.Entry it = (KeyStore.Entry) mapIt.next();
                String itemKey = String.valueOf(it.getKey());
                String item = String.valueOf(it.getValue());
                it = (Entry) mapIt.next();
                String priceKey = String.valueOf(it.getKey());
                Double price = Double.valueOf(String.valueOf(it.getValue()));
                it = (Entry) mapIt.next();
                String quantityKey = String.valueOf(it.getKey());
                Double quantity = Double.valueOf(String.valueOf(it.getValue()));
                double subtotal = quantity*price;
                System.out.println(itemKey+": "+item+" "+priceKey+": "+price+" "+quantityKey+": "+quantity+" "+"SubTotal: "+subtotal+"\n");
                total+=subtotal;
            }
        }
        System.out.println("Your Purchase total : "+total);
    }
}
}

 */
