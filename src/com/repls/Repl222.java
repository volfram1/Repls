package com.repls;

/*
Write the logic that picks largest and second largest numbers from a list add them and return the results.
input to method is a list that contains the numbers input [10,20,30,40]
output [70]
input[5,3,8,9,10,11,5]
output [21]
 */

import java.util.*;

public class Repl222 {

    public static int findMaxSum(List<Integer> list){
        Collections.sort(list);

        return list.get(list.size()-1)+ list.get(list.size()-2);

    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,8,9,10,11,5);
        System.out.println(findMaxSum(list));
    }

}

























/*
public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        /*Collections.sort(list);
        return list.get(list.size()-1) +list.get(list.size()-2);
int firstNum = Integer.MIN_VALUE;
    int secondNum = Integer.MIN_VALUE;
        for (Integer integer : list) {
                if (firstNum < integer) {
        secondNum = firstNum;
        firstNum = integer;
        } else if (secondNum < integer) {
        secondNum = integer;
        }
        }
        return firstNum+secondNum;
        }
public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
        }
        }
 */
