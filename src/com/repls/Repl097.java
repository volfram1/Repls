package com.repls;

import java.util.Scanner;

public class Repl097 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 

	    if (browser.equalsIgnoreCase("chrome")) {
				   System.out.println("Proceed with Chrome browser");
				   
			   }else if (browser.equalsIgnoreCase("firefox")){
				   System.out.println("Proceed with Firefox browser");
				   
			   }else if (browser.equalsIgnoreCase("ie")) {
				   System.out.println(("Proceed with IE browser"));
			   }else {
				   System.out.println("Invalid browser");
			   }
	    
	    
	}

}
