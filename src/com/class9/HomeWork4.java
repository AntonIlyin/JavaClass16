package com.class9;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     for (int i = 1; i <= 20; i++) {
	         System.out.println("please enter a number between 1-20 to win big suprize");
	         int num = scan.nextInt();
	         if (num==7) {
	             System.out.println("Congratulations!!! You got it");
	             break;
	             }else if(num>7) {
	                 System.out.println("sorry the number is too big");
	             } else {
	                 System.out.println("sorry the number is too small");
	             }
	     }
	     
	      
	     
	}
	 
	}

	


