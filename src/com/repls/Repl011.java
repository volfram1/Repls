package com.repls;

public class Repl011 {

	public static void main(String[] args) {

		/*
		 * Write a program to print the perimeter and area of a rectangle with width = 5 and height = 8.
		Output:
		The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __
		 */

		int per =perimeter(5,8);
		int ar=area(5,8);
		System.out.println("perimeter "+per+" area "+ar);

	}
	public static int perimeter(int width, int height){
		return (2*width)+(2*height);
	}
	public static int area(int width, int height){
		return width*height;
	}


}
