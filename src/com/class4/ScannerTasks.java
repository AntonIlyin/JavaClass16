package com.class4;

import java.util.Scanner;

public class ScannerTasks {
	public static void main(String[] args) {

		/*
		 *1. You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less than 200,000 then you would lend the money
		 * otherwise you would reject the client. 
		 * 2.You are DMV representative and you
		 * need to ask customer their age. If they are 18 and older you will issue a
		 * driver licence to them, otherwise you will offer them to get a learners
		 * permit. 
		 * 3.Create a Java program that will ask user to input temperature and
		 * city. Your program should convert Fahrenheit into celsius and print “The
		 * temperature is the city __ is __”
		 */

		Scanner loan=new Scanner(System.in);
		System.out.println("What the amount of loan do you need?");
		int l1=loan.nextInt();
		int money=10000;
		if(money<200000) {
			System.out.println("Would lend the money");
		}else {
			System.out.println("Reject the client");
		}
		//2.
		
		Scanner age=new Scanner(System.in);
		System.out.println("What is your age?");
		int ag=age.nextInt();
	 
		int age1=18;
		if(age1>=18) {
			System.out.println("You will issue a driver licence");
		}else {
			System.out.println("You will get a learning permit");
		}
		//3
		Scanner scan=new Scanner(System.in);
		System.out.println("PLease enter temperature");
		int temp=scan.nextInt();
		System.out.println("Please enter your city");
		String cityName=scan.next();
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The temperature in city "+cityName +" is "+convertedTemp);
	}
}
