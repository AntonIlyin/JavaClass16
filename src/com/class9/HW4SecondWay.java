package com.class9;

import java.util.Scanner;

public class HW4SecondWay {

	public static void main(String[] args) {
		//4. 2-nd way
	     
		Scanner scan;
		int secretNumber, guessNumber;
​
		scan = new Scanner(System.in);
		secretNumber = 12;
		// for (int i=0; i<20; i++) -> you are limiting user to 20 inputs
		do {
			System.out.println("Please guess my number from 1 to 20");
			guessNumber = scan.nextInt();
​
			if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
		} while (guessNumber != secretNumber);
​
		System.out.println("Congratulations you got it");
	}
}
