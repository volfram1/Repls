package com.repls;

public class Repl010 {

	public static void main(String[] args) {

		/*
		 * Declare 2 numbers and assign values 200 and 100 respectively.
		First, add numbers, then subtract, third multiply, forth divide.
		Please use variables to print the values of each operation result on a separate line.
		Output:
		300
		100
		20000
		2
		 */

		int num=200;
		int num2=100;

		int sum=num+num2;
		int sub=num-num2;
		int mul=num*num2;
		int div=num/num2;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}

}
