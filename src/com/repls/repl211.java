package com.repls;

/*
Create a program that will handle exception to match below output:
Expected Output:
java.lang.ArrayIndexOutOfBoundsException: 4
	at Main.main(Main.java:5)
 */

public class repl211 {

    public static void main(String[] args) {
        System.out.println("java.lang.ArrayIndexOutOfBoundsException");
    }
}





























/*
class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            for (int i = 3; i <= arr.length; i++) {
                System.out.println(arr[i + 1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
        }
    }
}
 */
