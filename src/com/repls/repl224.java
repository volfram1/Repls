package com.repls;
/*
Remove Consecutive duplicates Write the logic to remove only consecutive duplicates
input ["aabbcde"]-> output["abcde"]
input ["aabbcc"]-> output["abc"]
input ["aabbcca"]-> output["abca"]
input ["aabbccaddda"]-> output["abcada"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class repl224 {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabbccaddda"));
    }

    public static String removeConsecutiveDuplicates(String input) {

        ArrayList<Character> arrayList =new ArrayList<>();
        ArrayList<Character> newArrayList = new ArrayList<>();
        for (char c: input.toCharArray()
             ) {
            arrayList.add(c);
        }

        newArrayList.add(arrayList.get(0));
        for(int i=1; i<arrayList.size(); i++){
            if (arrayList.get(i-1) != arrayList.get(i)){
                newArrayList.add(arrayList.get(i));
            }
        }
        StringBuilder newStr = new StringBuilder();
        for(Character c: newArrayList){
            newStr.append(c);
        }

        return newStr.toString();

    }
}

































/*
public class RemoveRepetitions {
    public static String removeConsecutiveDuplicates(String input) {
        StringBuilder fina=new StringBuilder();
        char myFirstChar=' ';
        int mySize=input.length();
        for(int i=0 ;i<mySize;i++){
            char myChar=input.charAt(i);
            if(myChar!=myFirstChar){
                myFirstChar=myChar;
                fina.append(myFirstChar);
            }
        }
        return fina.toString();
    }
    public static void main(String[] args) {

System.out.println(RemoveRepetitions.removeConsecutiveDuplicates("aabbccadddag"));
    }
}
 */