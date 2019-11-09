package com.class11;

import java.util.Arrays;

public class ArrayManipulation {
public static void main(String[] args) {
	
	
	String [] actualName= {"John","Smith","Alex","Tanaz"};
	
	String [] expectedNames= {"Smith","John","Alex","Tanaz"};
	
	//To sort the elements of an Array
	Arrays.sort(actualName);
	System.out.println(Arrays.toString(actualName));
	Arrays.sort(expectedNames);
	String actual=Arrays.toString(actualName);
	String expected=Arrays.toString(expectedNames);
	System.out.println(actual.equals(expected));
	
	String firstName="Zom";
	String firstName2="Ali";
	
	String firstName3="Ali";
	 
	String firstName4="Zom";
	String actl=firstName +firstName2;
	String expt= firstName3 +firstName4;
	System.out.println(actl);
	System.out.println(expt);
	
	int [] numbers= {123,34,15,66,99};
	Arrays.sort(numbers);
	for (int i:numbers) {
		System.out.println(i+ " ");
	}
	
}
}
