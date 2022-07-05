package com.repls;

	/*
	Declare 3 instance variables to hold:
	year, school name and batch #
	Access variables from the main method and assign specific values to them
	Print values of your variables in the following format:
	Expected Output:
	I am a student of batch 9 studying at Syntax in the year of 2021
	 */

public class Repl0120 {
	
	static int year;
	static String school;
	static int batchNumber;

	public static void main(String[] args) {
		
		year=2021;
	    school="Syntax";
	    batchNumber=9;
	    System.out.print("I am a student of batch "+batchNumber+" studying at "+school+" in the year of "+year);

		
	}

}
