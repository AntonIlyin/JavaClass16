package com.class9;

public class Pattern {
public static void main(String[] args) {

	for(int k=1;k<=5;k++) {
		
		for(int l=1;l<=5;l++) {
			System.out.println("*");
		}
	}
	
	/*
	 *  print
	 *  
	 *   *****
	 *   *****
	 *   *****
	 *   *****
	 */
	 for(int i=1;i<=4;i++) {
		 
		 for(int j=1;j<=5;j++) {
			 System.out.print("*");
			 
		 }
		 System.out.println();
	 }
	
	 /*
	  * ********
	  * ********
	  * ********
	  * ********
	  */
			 
			 for(int i=0;i<=3;i++) {//rows  
				 
				 for(int a=0;a<=7;a++) {//columns
					 System.out.print("*");
				 }
				 System.out.println();
			 }
			 
			 /*
			  * print
			  * 
			  * 12345
			  * 12345
			  * 12345
			  * 12345
			  * 
			  */
			 for(int i=1;i<5;i++) {
				 
				 for(int j=1;j<6;j++) {
					 
					 System.out.print(j);
				 }
				 System.out.println();
			 }
			 /*
			  * print
			  * 123456789
			  * 123456789
			  * 123456789
			  * 123456789
			  * 123456789
			  * 
			  */
					 
			 for(int i=1;i<=5;i++) {
				 
				 for(int a=1; a<=9;a++) {
					 
					 System.out.print(a);
				 }
				 System.out.println();
			 }
			 /*
			  * print 
			  * 54321
			  * 54321
			  * 54321
			  * 54321
			  * 54321
			  
			  */
			 for(int i=5;i>=1;i--) {
				 for(int j=5;j>=1;j--) {
					 System.out.print(j);
				 }
				 System.out.println();
			 }
			 /*
			  * 55555
			  * 44444
			  * 33333
			  * 22222
			  * 11111
			   
			  */
			 for(int i=5;i>0;i--) {
				 
				 for(int j=5;j>0;j--) {
					 System.out.print(i);
				 }
				 System.out.println();
			 }
			 
			 /*
			  * print 
			  * *
			  * **
			  * ***
			  * ****
			  * *****
			  */
			 
			 for(int i=1;i<=5;i++) {
				 for(int a=1;a<=i;a++) {
					 System.out.print("*");
					 
				 }
				 System.out.println();
			 }
			 /*
			  * print
			  * 1
			  * 12
			  * 123
			  * 1234
			  * 12345
			  * 
			  */
			 for(int i=1;i<=5;i++) {
				 for(int a=1;a<=i;a++) {
					 System.out.print(a);
					 
				 }
				 System.out.println();
				 System.out.println("-------------------");
}
			 /*
			  * print
			  * 1
			  * 22
			  * 333
			  * 4444
			  * 55555
			  * 666666
			  * 7777777
			  * 88888888
			  * 999999999
			  */
			 for(int i=1;i<=9;i++) {
				 for(int a=1;a<=i;a++) {
					 System.out.print(i);
					 
				 }
				 System.out.println();
				 
}
			 
}}