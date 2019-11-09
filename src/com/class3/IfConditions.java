package com.class3;

public class IfConditions {

	public static void main(String[] args) {

		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("***********");
		
		double d =1.99;
		double d1=2.99;
		boolean b5=d>d1;
		System.out.println(b5);
		
		boolean b1=d<d1;
		System.out.println(b1);
		boolean b2=d==d1;
		
		boolean b3=d!=d1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("#################");
		
		int a= 90;
		int b=300;
		//if number is a bigger than number b
		//I want to print a is large than b
		
		if (a>b) {
			System.out.println("a is large than b");
			
			
			} else {
		System.out.println("a is smaller than b");
		
		int expectedHours=15;
		int actualHours=20;
		//If expected hours are more than actual -->you will succed
		//otherwise, please study more
		
		if(expectedHours>actualHours) {
			System.out.println("you will succeed");
			
			
		}else {
			System.out.println("please study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=5.99;
		//teaPrice-=2;// 2.99=4.99-2
		//if price is more that I can afford I will not buy
		//if price is less or matches what I can afford than I will buy tea
				
		if(allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
			System.out.println("And I will enjoy my tea");
			
		}else {
			
			System.out.println("I cant afford, I need to study more");
			System.out.println("I will go back to study more");
			
			
		}
		
		System.out.println("I keep writing some code");
		System.out.println("I keep writing some code");	
		
		boolean val=false;
				if (val) {
					System.out.println("Hello");
				}else {
					
					System.out.println("Bye");
				}
		
				
				boolean isRain=false;
				//if it is raining I will take umbrella, otherwise I will go for a walk
				
				if(isRain) {
					
					System.out.println("if it is raining I will take umbrella");
				}else {
					
					System.out.println("I will go for a walk");
				}
				
	}

}
}