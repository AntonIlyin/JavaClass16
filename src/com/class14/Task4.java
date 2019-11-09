package com.class14;

public class Task4 {

	public static void main(String[] args) {
		 /*
		  * * 4.How to find out the part of the string from a string?What is substring?Find number
		 * of words in string?
		  */
		System.out
        .println("Checking if one String contains another String using contains() in Java");
    String input = "C++ is predecessor of Java";
    boolean isFound = input.contains("Java");
    if (isFound) {
      System.out.println("input string: " + input);
      System.out.println("search string: " + "Java");
      System.out.println("does substring is found inside String? " + "YES");
    }
		
		
		
	}

}
