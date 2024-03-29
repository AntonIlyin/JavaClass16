package com.class14;

public class Task6 {

	public static void main(String[] args) {}
		 
		/*
		 * Write a Java Program to find whether a String is palindrome or
		 * not?
		 */
		
		// Function that returns true if 
	    // str is a palindrome 
	    static boolean isPalindrome(String str) 
	    { 
	  
	        // Pointers pointing to the beginning 
	        // and the end of the string 
	        int i = 0, j = str.length() - 1; 
	  
	        // While there are characters toc compare 
	        while (i < j) { 
	  
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	            // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--; 
	        } 
	  
	        // Given string is a palindrome 
	        return true; 
	    } 
	  
	    
	     

}
