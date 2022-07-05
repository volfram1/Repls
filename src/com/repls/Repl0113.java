package com.repls;

public class Repl0113 {
	 String clock(int hour,int min){
		    return (hour+":"+min);
		  }

	public static void main(String[] args) {

		Repl0113 obj=new Repl0113();
		  String result=obj.clock(11,30);
		  System.out.println(result);
		
	}

}
