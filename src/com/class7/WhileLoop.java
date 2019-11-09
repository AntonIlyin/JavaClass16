package com.class7;

public class WhileLoop {
public static void main(String[] args) {
	
	
	int time=8;
	if (time<12) {
		System.out.println("Good morning");// code executes 1
	}
	System.out.println("_______--_______--______");
	while(time<12) {
		System.out.println("Good morning");
		time++;
				
}
	//I want print GM 5 times
	
	int i=1;
	while(i<6) {
		System.out.println("Good morning");
		i++;
	}
	System.out.println("Outside of while loop");
}

}