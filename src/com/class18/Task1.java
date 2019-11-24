package com.class18;

public class Task1 {

	/*
	 * Create a method that will take 2 parameters as a numbers and prints which
	 * number is larger.
	 * 
	 * 
	 * Create a method that will take a number and prints whether the number is even
	 * or odd.
	 * 
	 * 
	 * Create a method that will print whether given String is palindrome or not.
	   
	 */
	//1.
	
	void number (int num1,int num2) {
		
		if(num1<num2) {
			System.out.println("This is number is "+num1+ " largest number");
		}else if (num1>num2) {
			System.out.println("This is number is "+num2+ " smalest number");
		}else {
			System.out.println("Numbers are equal");
		}
		
	}
	
	public static void main(String[] args) {
		
		Task1  number=new Task1();
		 
		number.number(30,20);
	}
 
	
	}
	 
		
 
	
	 
