package com.repls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repl209Adam {

        private static final String ITEMS_KEY = "Items";
        private static final String PRICE_KEY = "Price";
        private static final String QUANTITY_KEY = "Quantity";
    public static void main(String[] args) {


        // "Step one"
        List<Map<String, Object>> dataList = new ArrayList<>(); // who the fuck keeps objects this way

        HashMap<String, Object> appleMap = new HashMap<String, Object>() {{
            put(ITEMS_KEY, "Apple");
            put(PRICE_KEY, 20.00);
            put(QUANTITY_KEY, 10);
        }};

        HashMap<String, Object> orangeMap = new HashMap<String,Object>() {{
            put(ITEMS_KEY, "Orange");
            put(PRICE_KEY, 19.99);
            put(QUANTITY_KEY, 10);
        }};

        dataList.add(appleMap);
        dataList.add(orangeMap);

//         step 6
//        step 7 im pretty sure that idiot means EACH VALUE including KEY

//        step 8 wtf, dlaczego to gowno jest przed 9? od linijki:
        // step 10
        double purchaseTotal = 0;
        for (int i = 0; i < dataList.size(); i++) {
            Map<String, Object> currentMapValue = dataList.get(i);
            String type = (String) currentMapValue.get(ITEMS_KEY);
            double price = (double)currentMapValue.get(PRICE_KEY);
            int quantity = (int) currentMapValue.get(QUANTITY_KEY);

            // step 8
            double subTotal = price * quantity;
            purchaseTotal = purchaseTotal + subTotal;
            // step 9
            String result = String.format("Items: %s %s %.2f %s %d SubTotal: %.2f", type, PRICE_KEY, price, QUANTITY_KEY, quantity, subTotal);
            System.out.println(result);
        }

        System.out.println("Your Purchase total: " + purchaseTotal);

    }

// uzyles linkedHashMap, ale powiedz mi po co ;) po co ci kolejnosc? tracisz na szybkosci trzymajac ja, ciebie obchdoza tylko klucze
    // powiedz mi dlaczego lepiej uzyc arrayList, a nie LinkedList, albo moze czemu by uzyc Arrays.asList?

    // mozna to tez w ten sposob zainicjalizowac, sposobow jest mnostwo, zalezy co chcesz osiagnac. Arrays.asList uzywasz gdy lista nie bedzie zmieniala rozmiaru.
    // sprobuj do linijki z Arrays.asList zrobic .add(); kolejne i zoabczysz co sie stanie ;)

//        List<Map<String, Object>> dataList = Arrays.asList(appleMap, orangeMap);
//        List<Map<String, Object>> dataList = new ArrayList<>() {{
//            add(appleMap);
//            add(orangeMap);
//        }};
}
