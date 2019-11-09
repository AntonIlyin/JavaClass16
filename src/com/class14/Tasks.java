package com.class14;

public class Tasks {

	public static void main(String[] args) {

		/*
		 * 1.Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces. 
		 * 
		 * 2.Create a String that should be combination of
		 * letters, numbers and special characters. Find out how many alpha characters
		 * are there in the String. 
		 * 
		 * 3.You have a String a=”Is it saturday? Is it raining?
		 * Do we have a Java Class today?” How would you find out how many sentences are
		 * in that String?
		 * 
		 */
		//1

		String str="Hello, bye, goodbye";
		
		System.out.println(str.replace(" ",""));
		
		System.out.println("==================");
		
		//2.
		String str1="Hello bye 123%$$*&%, Great";
		 str1.length();
		 System.out.println(str1.replaceAll("[^A-z]","").length());
		 
		 System.out.println("+++++++++++++");
		 //3.
		 String a="Is it saturday? Is it raining?Do we have a Java Class today?";
		 
		 String [] s=a.split("\\?");	
		//for(int i=0;i<s.length;i++) {
				//System.out.println(s[i]);
		 
		  
		System.out.println(s.length);
		
				
		
	}

}
