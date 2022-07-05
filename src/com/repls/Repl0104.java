package com.repls;

import java.util.Scanner;

public class Repl0104 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		String[] arr=new String[5];
		
		
		for (int i=0; i<arr.length; i++){
			System.out.println(" enter the name");
			arr[i]=input.nextLine();
		}
		//System.out.println(Arrays.toString(arr));
		
		
		//System.out.println(arr[0]);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i].substring(0,3));
		}
		}
		
		
		}
		
		
		
		
		
		
		
	


