package com.repls;
/*
Create 3 overloaded methods to perform subtraction of 2, 3 and 4 numbers
In main method execute all 3 methods to match the output:
Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
 */

public class Repl0159 {

    void sub(int num1,int num2, int num3, int num4){
        System.out.println(num1-num2-num3-num4);
    }
    void sub(int num1,int num2, int num3){
        System.out.println(num1-num2-num3);
    }
    void sub(int num1,int num2){
        System.out.println(num1-num2);
    }

    public static void main(String[] args) {
        Repl0159 repl0159=new Repl0159();
        repl0159.sub(70,10,10,10);
        repl0159.sub(50,10,10);
        repl0159.sub(30,10);
    }

}
