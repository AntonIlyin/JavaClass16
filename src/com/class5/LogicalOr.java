package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		/*
		 * 7 days a week
		 * if days is 2 or 4-->SDLC class
		 * if day 6 or7-->Java class
		 * if day 1 or 5-->No class
		 * if day=3-->Review class
		 * 
		 */
		int day=6;
		if(day==2 || day==4) {
			System.out.println("SDLC class");
		}else if (day==6 || day==7) {
			System.out.println("Java class");
		}else if(day==1 ||day==5) {
			System.out.println("No class");
		}else if(day==3) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
		/*
		 * 7 days a week
		 * if days is Tuesday or Thursday-->SDLC class
		 * if day Saturday or Sunday-->Java class
		 * if day Monday or Friday-->No class
		 * if day=Wednesday-->Review class
		 * 
		 */
		String weekDay="Sunday";
		if(weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC class");
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java class");
		}else if(weekDay.equals("Monday") ||weekDay.equals("Friday")) {
			System.out.println("No class");
		}else if(weekDay.equals("Wednesday")) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
		
		
	}

}
