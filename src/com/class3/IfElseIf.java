package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		if (num1 > num2) {

			System.out.println("Num1 is larger than num2");
		} else if (num1 == num2) {

			System.out.println("Num1 is equal num2");

		} else {

			System.out.println("Num 1 is smaller than num2");

		}

		int day = 4;
		if (day == 1) {
			System.out.println("Today is Monday.I have to go to work");

		} else if (day == 2) {

			System.out.println("Today is Tuesday.I have SDLC class");
		} else if (day == 3) {
			System.out.println("Today is wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");

		} else if (day == 5) {

			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("I dont know this day");
		}

		System.out.println("I am done with if statement");
		
	}

}
