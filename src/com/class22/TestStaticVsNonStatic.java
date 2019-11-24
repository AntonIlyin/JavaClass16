package com.class22;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
		
		/*
		 * How to access static members
		 * static members can be accessed by className
		 */
		
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();
		
		/*
		 * How to access non static members
		 * static members 
		 * they can be accessed by creating Object of that class
		 */
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.name="John";
		obj.grade='A';
		obj.getInfo();
		//obj.getinfo1(); possible, but not preferable
	}
}
