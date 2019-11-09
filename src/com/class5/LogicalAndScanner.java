package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {

		/*
		 * Ask user to enter age if age is from 1 to 3-->you are baby if age if from
		 * 3-5--> you are toddler if age from 5-12-->you are kid if age from
		 * 12-19-->teenager if age from >20 you are an adult
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		int a = 33;
		if (a >= 1 && a <= 3) {
			System.out.println("You are a baby");
		} else if (a >= 3 && a <= 5) {
			System.out.println("You are toddler");
		} else if (a >= 5 && a <= 12) {
			System.out.println("You are kid");
		} else if (a >= 12 && a <= 19) {
			System.out.println("You are teenager");
		} else if (a > 20) {
			System.out.println("You are adult");
		} else {
			System.out.println("You are out of range");
		}

	}

}
