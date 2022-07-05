package com.repls;
/*
Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.
Input [12,12,13,45,78,7,7] output 2
Input [12,12,7,7,7,7,7] output 2
Input [12,120,13,45,78,17,57] output 0
Input [12,12,13,45,78,67,87] output 1
 */

import java.util.*;

public class Repl217 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        System.out.println(countDuplicates(list));
    }



    static int countDuplicates(List<Integer> numbers){

        HashSet<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (i == j) continue;
                if (numbers.get(i).equals(numbers.get(j)))
                    duplicates.add(numbers.get(i));
            }
        }
        return duplicates.size();
    }
    }




































/*
package com.collection.Coding;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class CountDuplicates {
    public static void main(String[] args) {
List<Integer> list1=new ArrayList<>();
list1.add(13);
        list1.add(12);
       list1.add(13);
        list1.add(15);
        list1.add(12);
        list1.add(12);
        System.out.println(duplicate(list1));
    }
    static int duplicate(List<Integer> numbers){
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if(i!=j && numbers.get(i)==numbers.get(j)){
                  set.add(numbers.get(i));
                }
            }
        }
        return set.size();
    }
}
 */
