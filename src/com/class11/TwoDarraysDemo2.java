package com.class11;

public class TwoDarraysDemo2 {

	public static void main(String[] args) {
		 
		String [][] names= {
				
				{"Khan","Yousuf","Alex","Zynab"},
				{"Mohammad","Anna","Anton","Weqas"},
				{"Diago","Asif","Zubair","Shogofa"}
				
				 
				
		};
		
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		int lengthOfColumns=names[0].length;
		System.out.println(lengthOfColumns);
		
		for(String getArrays[]:names) {
			
			for(String getName:getArrays) {
				
				System.out.print(getName+ " ");
			}
			System.out.println();
		}
		//Task:Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
		
		int [][] values= {
				{1,2,3,4},
				{5,4,3,2},
				{6,7,8,9}
				
		};
		int a=values.length;
		System.out.println(a);
		int b=values[0].length;
		System.out.println(b);
		for(int getValues[]:values) {
			for(int getValues1:getValues) {
				System.out.print(getValues1 +" ");
				
			}
			System.out.println();
		}
				

}}
