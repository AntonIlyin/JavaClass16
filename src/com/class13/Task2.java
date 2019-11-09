package com.class13;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS). 
		 * Create a String and if the String is not empty perform the following: if the String
		 * has an odd number of characters and has 3 or more characters, print the
		 * character in the middle of the String.
		 * 
		 */

		 //1.
		
		String day="Sunday";
	    
	    for(int a=day.length()-1;a>=0;a--) {
	        System.out.print(day.charAt(a));
	    }
	        
	    System.out.println();
		}
		//2.
	{
		
		  String str2 = "Hellourwewr";
		  int midlle=str2.length()/2;
		  System.out.println();
	        if (!str2.isEmpty()) {
	         if(str2.length()%2!=0 && str2.length()>=3) {
	        	 
	         System.out.println(str2.charAt(midlle));
	}
	
	
	
	}}}


