package com.repls;
/*
Write a method with the following specs:
Returns:
a String
Name:
surround
Parameters:
a String called s
a String called search_term
Then complete the method by programming the following behavior
Return a new String built from s that has every instance of the search term surrounded by parentheses
See below examples.
Examples:
surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
surround("technology",'o') ==> "techn(o)l(o)gy"
 */

public class Repl0135 {
    static String surround(String s, String search_term){

                s=s.replace(search_term,"("+search_term+")");

        return s;
        }


    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }

}
