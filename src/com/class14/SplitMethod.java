package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		 
		/*
		 * .split
		 * THis method splits this string around matches of the given regular expression
		 */
		
		//split the following string into array of strings/work
		String str="Video provides a powerful way to help you prove your point";
		String[] array=str.split(" ");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			 
		} 
		System.out.println("+++++++++++++++++++++++++++");
		// How we can find how many sentences are in the following string;
		
		String str1="Today is Sunday.Its sunny day .and we are having Java class";
		
		String [] array2=str1.split("\\.");
		System.out.println("The number of Scentences in the given String is:: "+array2.length);
//	for (String string : array2.l) {
	//	System.out.println(string.trim());
	}
		
		
	}


