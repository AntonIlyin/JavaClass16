package com.class20;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a method that will take 1 parameter as a String and return reversed
		 * String. Method should be visibly only within same package.
		 */
		 
		 Task1 task=new Task1();
		 String result=task.reverseString("Syntax");
		 System.out.println(result);
		 String str="madam";
		 
		 boolean result2=task.isPalindrome("Syntax");
		System.out.println("Is "+str+ "Palindrome? "+result2);
	}
	public boolean isPalindrome(String param) {
		boolean result=false;
		String reverse=reverseString(param);
		if (param.equalsIgnoreCase(reverse)) {
			result=true;
		}
		else {
			result=false;
		}
		return true;
	}
	
	
	
	String reverseString(String param) {
		String result="";
		char [] charArray=param.toCharArray();
		for (int i=charArray.length-1;i>=0;i--) {
			result +=charArray[i];
		}
		return result;
	}
	 
}
 