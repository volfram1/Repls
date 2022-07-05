package com.repls;

import java.util.Scanner;

public class Repl0101 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    
	    for (int i=0; i<word.length(); i++) {
	    	System.out.println(word.charAt(i)+" ");
	    	
	    }
	}

}
