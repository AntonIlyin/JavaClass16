package com.class11;

import org.omg.Messaging.SyncScopeHelper;

public class Tasks {

	public static void main(String[] args) {

		/*
		 * 1.Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array. 
		 * 2.Create an array on integers and calculate
		 * the sum of all elements in an array. 
		 * 3.Create an array of countries. While
		 * retrieving all values from an array print capital for each country. (use 2
		 * different loops).
		 */
//1.
		
		String [] cars= {"Mercedez","Mazda","BMW","Opel","Tesla","Ferrari"};
		for (String car:cars) {
			System.out.println(car);
			
		 
		}
		
		//2.
		
		int [] array= {1,2,3,4};
		
		System.out.println(array [0] + array[1] + array[2]+ array[3]);
	}
	
//3.
	{
	String [] countries= {"USA","Russia","China"};
	for(String getCountry:countries){
		if(getCountry.equals("USA")){
			System.out.println("Washington DC");
		}if(getCountry.equals("Russia")) {
			System.out.println("MOscow");
		}if(getCountry.equals("China")) {
			System.out.println("Hong Kong");
		}
	
	}
	
	for(int i=0;i<countries.length;i++) {
		
		if (countries[i].equals("USA")) {
			System.out.println("Washingtond DC");
		}
		 
}}}
