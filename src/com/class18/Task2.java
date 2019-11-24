package com.class18;

import RiplTasks.Main;

public class Task2 {

	/*
	 * Create a method that will take a number and prints whether the number is even
	 * or odd.
	 */
void number1(int num3,int num4) {
		
		if(num3%2==0) {
			System.out.println("Number is "+num3);
		}else {
			System.out.println("Number is "+num4);
		}
	 
}

public static void main(String [] args) {
	
	Task2 num=new Task2();
	num.number1(5, 4);
	  
}
}
