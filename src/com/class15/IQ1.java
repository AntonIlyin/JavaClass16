package com.class15;

public class IQ1 {

	public static void main(String[] args) {
		/*
		 * 1.Write a program to swap 2 numbers with out a temporary variable?Swap 2 strings without a 
				   temporary variable?
		 */
				 
		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("The value of a= "+a);
		System.out.println("The value of  b= "+b);
		
		String str1="Hello";
		String str2="Welcome";
		
		str1=str1+str2;//HelloBye
		str2=str1.substring(0, 5);//Hello
		str1=str1.substring(5);
		System.out.println("The value of str1= "+str1);
		System.out.println("The value of str2= "+str2);
		
		//or you can do dynamically
		str2=str1.substring(0,str1.length()-str2.length());//Hello
		str1=str1.substring(str2.length());
		
		
		
		
		
	}

}
