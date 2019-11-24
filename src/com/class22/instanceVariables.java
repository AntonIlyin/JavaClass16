package com.class22;

public class instanceVariables {

	String name="Samir";
	
	public static void main(String[] args) {
		
		String name="Burcu";
		System.out.println(name);
		
		instanceVariables obj=new instanceVariables();
		System.out.println(obj.name);
		//changing value of the instance variable
		obj.name="John";
		System.out.println(obj.name);
		//creating new instance of class instanceVariables
		instanceVariables obj2=new instanceVariables();
		//output will be Samir
		System.out.println(obj2.name);
	}
}
