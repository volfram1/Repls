package com.repls;
    /*
    Complete the mystery method so that it takes in an integer array as a parameter,
    and then modifies each element based on whether it's even or odd.
    If the number is even,  If it's odivide it by 2.dd, multiply it by 10.
    Expected Output:
    10 1 30 2 50
     */

public class Repl0130 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        mystery(a);

    }
    static void mystery(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                System.out.print(array[i]/2+" ");
            }else{
                System.out.print(array[i]*10+" ");;
            }

        }
    }

}
