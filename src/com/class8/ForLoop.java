package com.class8;

public class ForLoop {
	public static void main(String[] args) {
		/*
		 * Say good morning 5 times
		 */
		// initialize;test condition;increment
		for (int i = 0; i <= 4; i++) {
			System.out.println("Good morning");
		}

		// print numbers from 1-10;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// print numbers
		for (int i = 1; i >= 10; i--) {
			System.out.println(i);
		}
		for (int i = 0; i <= 50; i += 5) {
			System.out.println(i);
		}
		for (int i = 1; i <= 100; i++) {
			System.out.print(" " + i);
		}
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i);

			}

		}
		for (int i = 21; i <= 50; i += 2) {

			System.out.println(i);
		}
		// what is the output
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
			System.out.print(sum + "+");
		}
		System.out.println();
		System.out.println(sum);
	

	// what is the output?
int sumAll=0;
for(int i = 0;i<=20;i+=5)
	{
		sumAll = sumAll + i;
	}
System.out.println(sumAll);
System.out.println("************");
//what the output
int total=2;
for (int y=1;y<=3;y++) {
	total=total*y;//2=2*1; 4=2*2;12=4*3
}
System.out.println(total);
}

}
