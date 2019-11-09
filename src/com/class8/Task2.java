package com.class8;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * write a code to find the sum of even & odd numbers
		 * from range 1 to 20
		 * expecting 2 outputs
		 * sum for odd nums=.
		 * sum for even nums=...
		 */
int sum=0;
int sum1=0;
 
for(int i=1;i<=20;i++) {
	 
	if(i%2==0) {
		sum=sum+i;
		 		
	} else {
	sum1=sum1+i;
	}
	 	}
System.out.println("The total of all even#="+ sum);
System.out.println("The total of all odd#="+ sum1);
}
		
	}


