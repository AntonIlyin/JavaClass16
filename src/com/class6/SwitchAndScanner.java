package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		/*
		 * ask user to enter their gender F or M
		 * based on input provide:
		 * if F->Female
		 * if M->Male
		 * otherwise->Unknown
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter you gender: F or M");
		char gender=scan.next().charAt(0);
		String userGender;
		//works only with byte,short,int,char,String
		switch(gender) {
		case 'F':
			userGender="Female";
			break;
		case 'M':
			userGender="Male";
		break;
		default:
			userGender="Unknown";
		
		} 
		System.out.println("Your gender is "+ userGender);
		
	}

}
