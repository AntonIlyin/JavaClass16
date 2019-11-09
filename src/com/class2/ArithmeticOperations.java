package com.class2;

public class ArithmeticOperations {

	/*
	 * declare 2 variables and initialize them display result of addition,
	 * substraction,multiplication and devision
	 */
	public static void main(String[] args) {

		int num1, num2;
		num1 = 20;
		num2 = 10;
		System.out.println(num1 + num2);// 30
		System.out.println(num1 - num2);// 10
		System.out.println(num1 * num2);// 200
		System.out.println(num1 / num2);// 2

		// How we can print valueof num1 and num2 together

		System.out.println(num1 + " " + num2);

		int sum = num1 + num2;

		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		// the addition of 2 numbers is_
		System.out.println("the addition of 2 numbers is_"+ sum);
		System.out.println("the substraction of 2 numbers is_"+ sub);
		System.out.println("the multiple of 2 numbers is_"+ mult);
		System.out.println("the division of 2 numbers is_"+ div);

	}

}
