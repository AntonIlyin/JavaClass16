package com.class18;

public class Task3 {

	// Create a method that will print whether given String is palindrome or not.
	
	void palindrome(String original,String reversed) {
		
		  if(original.contentEquals(reversed)) {
	            System.out.println("String is a palindrome");
		  }else {
			  System.out.println("String is not a palindrome");
		  }
	}
	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		obj.palindrome("Hello","kayak");
		String original = "kayak";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i); // "+k=k+a=ka+k
	}
}}
