package com.class5;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*1.Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F


2.Write a program to determine the classMode.
If there is no rain → classMode=“In Class”, otherwise classMode → “Online”.
*/
		//1.
		Scanner scan;
		int quiz,midTerm,finalScore,average;
		scan=new Scanner(System.in);
		System.out.println("Please enter your Quiz score:");
		 quiz=scan.nextInt();
		System.out.println("Please enter your midTerm score:");
		 midTerm=scan.nextInt();
		System.out.println("Please enter your final score:");
		
		 finalScore=scan.nextInt();
		 average=(quiz+midTerm+finalScore)/3;
		if(average>=90){
			System.out.println("A");
		}else if(average>=70 && average<90){
			System.out.println("B");
		} else if (average>=50 && average<70){
			System.out.println("C");
		}else if (average<50){
			System.out.println("F");
		}else{
			System.out.println("Out of range");
		}
		//2.
		
		boolean isRain=true;
		String mode="In class";
		String mode1="Online";
		if(!isRain){
			System.out.println("In class");
		}else{
			System.out.println("Online");
		}
		  {
			
		}
		
	}

}
