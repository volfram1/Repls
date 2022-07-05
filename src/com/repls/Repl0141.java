package com.repls;
/*
For you to do: Create the maxValue method that will accept int array and return return the maximum value in the array.
Method should visible every class in any package!
Expected Output:

22
 */

import java.util.Arrays;

public class Repl0141 {
    public static int maxValue(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5,12,-3,22,7,3};
        System.out.println(maxValue(arr)); //should print 22
    }


}
