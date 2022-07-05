package com.repls;

/*
Create an Array of size N whose elements sum to zero
ArraySumToZero(0) ->{}
ArraySumToZero(1) ->{0}
ArraySumToZero(2) ->{-1,1}
ArraySumToZero(3) ->{1,-1,0}
ArraySumToZero(4) ->{2,-2,3,-3}
N will be given as input to the function and fucntion will return an array whose element will sum to zero.
 */

import java.util.Arrays;

public class Repl216 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrSumToZero(2)));

    }

    public static int[] arrSumToZero(int N) {
        int[] intArr = new int[N];
        for(int i=0;i<N/2;i++){
            intArr[i]=N-i;
            intArr[intArr.length-1-i]=(N-i)*-1;
        }

        return intArr;
    }
    }



































/*
package com.collection.Coding;
import java.util.Arrays;
public class ArraySumZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZero(1)));
        System.out.println(Arrays.toString(arraySumToZero(2)));
        System.out.println(Arrays.toString(arraySumToZero(0)));
    }
    public static int[] arraySumToZero(int N) {
        // write your code in Java SE 8
        if(N==1){
            return  new int[]{0};
        }
        int num = N/2;
        int[] res = new int[N];
        int index=0;
        while(num>0){
            res[index++]=num;
            res[index++]=num *-1;
            num--;
        }
        if(N%2!=0){
            res[res.length-1]=0;
        }
        return res;
    }
}
 */
