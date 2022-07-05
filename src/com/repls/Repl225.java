package com.repls;
/*
Reverse the number
Input[123] ->output [321]
Input[12345] ->output [54321]
Input[1001] ->output [1001]
Input[789] ->output [987]
 */

public class Repl225 {

    public static void main(String[] args) {

        System.out.println(reverseInteger(-123));
    }

    public static int reverseInteger(int N){

         int revInt=0;
         int a;
         while (N!=0){
             a= N % 10;
             N/=10;
             revInt = (revInt * 10)+a;
         }
        return revInt;
    }

}



































/*
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(54321));
        System.out.println(reverseInteger(654));
        System.out.println(reverseInteger(123));
        System.out.println(reverseInteger(789));
    }
    public  static int reverseInteger(int N){
        String number=String.valueOf(N);
        StringBuilder stringBuilder=new StringBuilder(number);
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
    }
}

 */
