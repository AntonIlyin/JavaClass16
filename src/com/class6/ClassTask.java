package com.class6;

import java.util.Scanner;

public class ClassTask {
public static void main(String[] args) {
	
	/*
	 * ask user to enter the month the were born,
	 * based on the month define the season
	 * if user is born in jan,feb,dec-->winter
	 * if mar,apr,may-->spring
	 * if jun,jul,aug-->summer
	 * if sep,oct,nov-->fall
	 * otherwise-->unknown
	 * at the end of the program
	 * "you were born in ___"
	 */
	String month;
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the month were you born");
	  month=scan.nextLine();
	 String season;
	 
	if(month.equals("jan") || month.equals("feb") || month.equals("dec")) {
		season="Winter";
	}else if(month.equals("mar") || month.equals("apr")|| month.equals("may")) {
		season="Spring";	
		}	else if(month.equals("jun")||month.equals("jul")||month.equals("aug")) {
			season="Summer";
		}else if(month.equals("sep")||month.equals("oct")||month.equals("nov")) {
			season="Fall";
		}else {
			season="Unknown";
		}
	
	
	System.out.println("You were born in "+ season);
	System.out.println(month);
	}
}

