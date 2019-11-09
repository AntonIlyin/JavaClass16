package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		 
		//
		char[] grades= {'a','b','c','d','e','f'};
		int a=2;
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		
		a+=2;//2+2
		System.out.println(grades[a]);
		a--;//3
		System.out.println(grades[a]);
		
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		
		for(int i=0;i<grades.length;i++) {
			System.out.println(grades[i]);
		}
		String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
		int size=animals.length;
		for(int i=0;i<size;i++) {
			System.out.print(animals[i]+" ");
		}
		//create an array to store 5 double values, print all in one line
		
		double[] values= {1.2,1.3,1.4,1.5,1.6};
		double size1=values.length;
		for(int i=0;i<size;i++) {
			System.out.print(values[i]+" ");
		}
	}

}
