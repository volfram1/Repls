package com.repls;

import java.util.Scanner;

public class Repl0105 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    
	    System.out.println(word.replaceAll("[^aeiouy]",""));
	}

}
