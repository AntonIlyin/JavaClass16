package com.class19;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestAllMethods {
public static void main(String[] args) {
	
 
	//find the largest number from 300 and 500, than identify if the 
	//largest # is 
	
	AllMethods obj=new AllMethods();
	int large=obj.findLargest(300,500);
	System.out.println(large);
	 boolean odd=obj.isOdd(large);
	 System.out.println(odd);
	 
	 //call method weekDayName
	 //if (tuesday,wednesday,thursday,saturday,sunday)
	 //--> I am learning Java

	String day= obj.weekDayName(5);
	 if (day.equals("Tuesday") || day.equals("Wednesday")|| day.equals("Thursday") || day.equals("Saturday") || day.equals("Sunday")){
		 System.out.println("I am learning Java");
	 }else {
		 System.out.println("I am practicing Java");
	 }
	}
	
}
	
 
