package com.repls;
/*
Count the number of characters in the last word of a String
"I love Java" => 4
"i love coding" =>6
"sun" =>3 ""=>0
 */



public class Repl228 {
    public static void main(String[] args) {
        System.out.println(countLastWordChar("Hello world"));

    }

    public static int countLastWordChar(String str){

        String[] strArr = str.split(" ");
        int lastWord = strArr[strArr.length-1].length();
        return lastWord;
    }
}

