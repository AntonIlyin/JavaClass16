package com.class4;

public class Tasks {
	public static void main(String[] args) {

		/*
		 * 1.Write a program to store a boolean value of whether user has diploma or
		 * not. If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 → output should
		 * say “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder” . 2.Create a Java program and store values of mortgage rate and
		 * mortgage price. First, program should check if rate is higher than 4.5 user
		 * will not buy a house, otherwise user will consider buying. Once user decides
		 * to buy a house, if price of the house is larger than 200000 than user will
		 * take a loan, otherwise user will pay cash.
		 * 
		 */

		boolean diploma = false;
		double gpaScore = 4.5;
		if (diploma) {
			System.out.println("Congratulations");
		} else {
			System.out.println("You have to go and study");
		}
		if (gpaScore >= 3.5) {
			System.out.println("You are eligible for scholarship");
		} else {
			System.out.println("You should have studied harder");

		}
		// 2.

		double rate = 3.5;
		int mortgagePrice = 500000;
		if (rate > 4.5) {
			System.out.println("User will not buy a house");
		} else {
			System.out.println("Consider buying");
		}
		if (mortgagePrice > 200000) {
			System.out.println("WIll take a loan");
		} else {
			System.out.println("Will pay cash");
		}
	}
}
