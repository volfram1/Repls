package com.repls;
    /*
    Create the maxLength method that will accept String array of words
    and return the word with the largest length.
    Method should visible only within same package!
    Expected Output:
    this is long
     */

import java.util.Arrays;

public class Repl0140 {
    static String maxLength(String[] arr){

        Arrays.sort(arr); //--> wedlug kolejnosci alfabetycznej

        String max=arr[arr.length-1];
        return max;
    }
        /*int howLong=0;
        String longestString=null;
        for (String s:arr) {
            if (s.length()>howLong){
                howLong=s.length();
                longestString=s;
            }

        }
        return longestString;
    }*/

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
    }

