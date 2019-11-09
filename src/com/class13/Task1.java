package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		 
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your class day::");
		String day=scan.nextLine();
		//String day1=day.toLowerCase();
		
		if(day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your Java class");
		}else if (day.trim().equalsIgnoreCase("sunday")) {
			System.out.println("Sunday is your GIT class");
		}else if (day.trim().equals("tuesday")) {
			System.out.println("Tuesday your SDLC class");
		}else if (day.trim().equals("thursday")) {
			System.out.println("Thursday your MAnual class");
		
		
		

	}else {
		System.err.println("Invald entry!!!");
	}
scan.close();
}}
