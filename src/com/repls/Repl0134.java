package com.repls;
    /*
    Write a method with the following specs:
    Returns:
    an integer
    Name:
    countVowels
    Parameters:
    a String called s
    Purpose:
    count the number of vowels in the string s.  Assume s is all lowercase.
    Examples:
    countVowels("obama") ==> 3
    countVowels("happy friday! i love weekends") ==> 9
     */

public class Repl0134 {
    static int countVowels(String s){
        String a=(s.replaceAll("[^aeiou]",""));
        int b =a.length();

        return b;
    }
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }

}
