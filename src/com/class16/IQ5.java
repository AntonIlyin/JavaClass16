package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		 
		/*
		 * 5.Write a java program to reverse String? Reverse a string
		 * word by word?
		 */
		
		//Reverse String word by word
		String given="Welcome to the Java class";
		/*
		 * to reverse String
		 * split();
		 * Step1: split-->array of String
		 * Step2:use for loop and use decrement to print values
		 */
		String reversed="";
		
		String [] str=given.split("\\s");
		for(int i=str.length-1;i>=0;i--) {
			//System.out.println(str[i]);
			reversed=reversed +str[i]+" ";
		}
		
		System.out.println(reversed);
		//Write a java program to reverse String?
		//toCharArray(); charAt();
		
		String given1= "Welcome to the Java class";
		char[] charArray=given1.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
				System.out.println("========================");
		///Using CharAt();
		
		String  word2="I love Java";
		for(int j=word2.length()-1;j>=0;j--) {
			System.out.print(word2.charAt(j));
		}
	}

}
