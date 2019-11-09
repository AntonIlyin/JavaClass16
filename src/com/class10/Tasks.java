package com.class10;

public class Tasks {

	public static void main(String[] args) {

		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 * 
		 * 
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 * 
		 * 
		 * Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using element of array: “Saturday is Java coding Day”.
		 */

		//1.
		
		char[] name =new char[6];
		name[0]='A';
		name[1]='B';
		name[2]='C';
		name[3]='D';
		name[4]='E';
		name[5]='F';
		System.out.println(name[1]);
		
		char [] name1= {'A','B','C','D','E','F'};
		System.out.println(name1[1]);
		
		//2.
		String[] name2= {"Diana","Anton","Olga","Karina"};
		System.out.println(name2[1]);
		
		String[] name3=new String[4];
		name3[0]="Diana";
		name3[1]="Anton";
		name3[2]="OLga";
		name3[3]="Karina";
		System.out.println(name3[1]);
		
		//3.
		
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println( words[1] + " "+words[4]+ " "+words[0] +" "+ words[3]+" "+words[2]);
	}

}
