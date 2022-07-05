package com.repls;
/*
Count the maximum repetition of a character examples are given below
"abscaaaaabdddd" -> 6
"dddddddddd" -> 10
"daccccdndeeeennnnndddddd" -> 9
"a"->1 ""-> 0
 */

import java.util.HashMap;
import java.util.Map;

public class Repl229 {
    public static void main(String[] args) {
        System.out.println(countMaxValue("abscaaaaabdddd"));
        System.out.println(countMaxValue("dddddddddd"));
        System.out.println(countMaxValue("daccccdndeeeennnnndddddd"));
        System.out.println(countMaxValue("a"));
    }

    public static int countMaxValue(String s){
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if (map.containsKey(arr[i]) == false){
                map.put(arr[i],1);
            }else{
                int value = map.get(arr[i]);
                int newValue = value + 1;
                map.put(arr[i] , newValue);
            }

        }
        System.out.println(map);

        int maxValue=0;
        char maxKey = ' ';
        for (Map.Entry<Character, Integer> data : map.entrySet()
        ) {
            if (data.getValue()> maxValue){
                maxValue= data.getValue();
                maxKey=data.getKey();
            }


        }
       return maxValue;
    }
}
