package com.class2;

public class Variables {

	public static void main(String[] args) {

		String name = "Anton";
		String lastName = "Ilyin";
		char grade = 'D';
		String city = "Alexandria";
		String state = "VA";
		long phoneNumber = 6092715855l;

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);

		// Sting city ="Cheboksary";->we do not need declare variable again!!!!!!!!!!

		city = "Cheboksary";
		state = "MD";
		phoneNumber = 64656468;
		grade = 'A';
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);

		// Task add value:
		// My name is_
		// I live in city of_
		// My phone number is_

		System.out.println("My name is " + name);
		System.out.println("I live in " + city);
		System.out.println("My phone number is " + phoneNumber);
		
		int num1=12;
				int num2=13;
				//Task:
				//Print.The value of num1=_and the value of num2=_
				System.out.println("The value of num1="+num1+ "and the value of num2="+num2);
				
				String fruit ="banana";
						char dollar='$';
						 double price=1.99;
						 //The price of banana is $1.99
						 System.out.println("The price of "+fruit+" is "+ dollar +price+"!!!");
						 
				
		

	}
}
