package com.class5;

public class TasksAndOr {

	public static void main(String[] args) {

		/*1.
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 * 
		 * 2.
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 5 feet) medium(5 to 6 feet)
		 * tall (6 feet and over)
		 */

		int day=3;
		if(day>1 && day<5) {
			System.out.println("It is a weekday");
		}else if(day==6 ||day==7) {
			System.out.println("It is a weekend");
		}else {
	System.out.println("Invalid day");
		}
		
		//2.
		int i=1;
		if(i<5) {
			System.out.println("Short"); 
			
		}else if (i==5 ||i==6) {
			System.out.println("Medium");
		}else if(i>6) {
			System.out.println("Tall");
		}else {
			System.out.println("Out of range");
		}
	}
}
