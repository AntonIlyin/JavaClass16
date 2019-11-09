package com.class3;

public class IfElseTask {

	public static void main(String[] args) {
		/*
		 * 1)Create a Java program and declare int variable that will hold a month.
		 * Based on the value of the variable your program should print the name of the
		 * month. 2)Write a program to check whether number is positive or negative
		 * 3)Interview Question Write a Java Program to check whether number is Even or
		 * Odd.
		 */
		// 1
		int month = 3;
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");

		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else {
			System.out.println("Dont know month");
		}
		// 3
		int number = 12;

		if (number % 2 == 0) {

			System.out.println(number + "is even");
		} else {
			System.out.println(number + "is Odd");
		}
		// 2
		int num = -12;
		if (num>0) {
			System.out.println("Number is positive");
		}else if (num==0) {
			System.out.println("Number is equal");
			
		}else {
			System.out.println("Number is negative");
		}

	}

}
