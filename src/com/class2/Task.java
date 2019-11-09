package com.class2;

public class Task {

	public static void main(String [] args) {
		
		//1.Write a Java programm to add, substract,multiply and divide 2 decimal values. Your program should say."The ___"of 2 numbers__ and__is equal to__
		
		int num1,num2;
		num1=15;
		num2=20;
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div= num1/num2;
		System.out.println("The "+sum+ " of 2 numbers "+num1+ " and "+num2+ " is equal to"+ sum);
	
		//2.Write a program to find the square of the number 3.9.You program should say "The square of the___is__"
		
		double square =3.9;
		double sq= square*square;
		System.out.println("The square of the "+ square +"+ is_"+sq );
		
		//3.Write a program to print the area and perimeter of a rectanlge with width=5 and height=8.Your program should say."The perimeter of a rectangle with width __and heights__is equal to__and the area is__"
		
		
		int width=5;
		int height=8;
		int perimeter=2*(width+height);
		int area=width*height;
		System.out.println("The perimeter of a rectangle with width "+ width+ " and height "+height+ " is equal to "+perimeter+ " and the area is "+ area);
		
		String message= "The perimeter of a rectangle with width "+ width+ " and height "+height+ " is equal to "+perimeter+ " and the area is "+ area;
		System.out.println(message);
		
		
		
		
	}
}
