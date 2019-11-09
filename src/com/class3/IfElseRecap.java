package com.class3;

public class IfElseRecap {

	public static void main(String[] args) {

		/*
		 * Class schedule if Tuesday-->sdlc if Wednesday -->jave review if
		 * Thursday-->Sdclc if Saturday-->java coding if Sunday-->my favorite Javacoding
		 */

		int day = 4;
		if (day == 2) {
			System.out.println("SDLC class");
		} else if (day == 3) {
			System.out.println("Review Class");
		} else if (day == 4) {
			System.out.println("SDLC Class");
		} else if (day == 6) {
			System.out.println("Java class");
		} else if (day == 7) {
			System.out.println("Favorite Java class");
		} else {
			System.out.println("There is no class today");
		}

	}

}
