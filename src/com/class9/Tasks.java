package com.class9;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		 /*
		  *1 Print the following pattern:
55555
4444
333
22
1  
		  * 2.
		  * print
		  * *
		  * **
		  * ***
		  * ****
		  * *****
		  * ****
		  * ***
		  * **
		  * *
		  * 3.
		  * Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.
		  * 
		  *4.Write a guessing game where the user has to guess a secret number between 1 and 20. After every guess input, the program tells the user whether their number was too large or too small. The program will keep asking the user to enter the number until he finds the correct number. When the correct answer is found the system should display “Congratulations!!. You got it!” 



		  */
		 //1.
		for (int a=5 ; a>0 ; a--) {
		    for (int b=1 ; b<=a ; b++) {
		        System.out.print(a);
		    }
		System.out.println();
		
		 }
		  //2.
		for(int i=1;i<=5;i++) {
	        for(int j=1;j<=i;j++) {
	            System.out.print("*");
	        }System.out.println();
	    }
	    for(int i=4;i>=1;i--) {
	        for(int j=1;j<=i;j++) {
	            System.out.print("*");
	        }System.out.println();
	    }
	    
	    //3
	    Scanner scan=new Scanner(System.in);
        System.out.println("enter start point");
        int a=scan.nextInt();
        
        System.out.println("enter end point");
        int b=scan.nextInt();
        int evenTotal=0;
        int oddTotal=0;
        
        for(int  i=a; i<=b; i++) {
        if (i%2==0) {
            evenTotal=evenTotal+i;
        }
        else {
            oddTotal=oddTotal+i;
        }
            
        }
        System.out.println("even total is "+evenTotal);
        System.out.println("even total is "+oddTotal);
    }
 
	{
	  
         }
     }
		
     
	            
	            
 


