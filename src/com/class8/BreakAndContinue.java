package com.class8;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
//break keyword breaks/exist the loop
		for (int i = 0; i < 10; i++) {

			if (i == 2) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("I am outside of the loop");

		//continue- it will skip CURRENT iteration
		
		for (int i=1;i<=5;i++) {
			if(i==2 || i==3) {
				continue;
				
			}
			System.out.println(i);
		} 
		
		System.out.println("I am outside of the loop");
		System.out.println("******************");
		
		// I want to print nums from 1 to 20 except 5,6,7
		
		for(int a=1;a<=20;a++) {
			if(a==5 || a==6 ||a==7) {
				continue;
			}
			System.out.println(a);
			
			/*1Print numbers from 1 to 50 except those that are divisible by 3.
			 * 
			 * 2.Create a program that will be asking user to apply for a credit card 10 times.As soon you get an "yes " from a user program should stop asking
			 */
			//1
			
			for(int i=1;i<=50;i++) {
				if(i%3==0) {
					continue;
				}
				System.out.println(i);
				
				//2
			 Scanner scan=new Scanner(System.in);
			 String answer;
			 
				for(int b=1;b<=10;b++) {
					System.out.println("Would you like apply for a credit card?");
					 answer=scan.nextLine();
					 if(answer.equalsIgnoreCase("yes")) {
						 break;
					 }
					 
					}
					
				}
					
				}
			 
			}
			
		}
		
		
	


