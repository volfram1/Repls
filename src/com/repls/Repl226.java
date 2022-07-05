package com.repls;
/*
Reverse the String without using the Reverse method from the BtringBuilder Class input["I am a java Programmer"] output["Programmer java a am I"]
input["Syntax is Great"] output["Great is Syntax"]
 */

import java.util.Arrays;

public class Repl226 {

public static String reverse(String strToRev){

    String[] newStr=strToRev.split(" ");
    String reversedString = "";
    for (int i = 0; i <newStr.length ; i++) {
        if( i == newStr.length-1){
            reversedString = newStr[i] + reversedString;
        }else {
            reversedString = " "+newStr[i]+reversedString;
        }
    }
    return reversedString;
}

    public static void main(String[] args) {
        System.out.println(reverse("I am a java Programmer"));
    }
}
