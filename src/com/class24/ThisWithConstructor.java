package com.class24;

public class ThisWithConstructor {

	  ThisWithConstructor() {
		 System.out.println("I am non argument constructor");
	}
	
	ThisWithConstructor(String str){
		this();//used to call current class constructor
		System.out.println("I am   constructor with 1 String parameter");
	}
	
	ThisWithConstructor(String str,String str1){
		this("Hello");
		System.out.println("I am   constructor with 2 String parameters");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		System.out.println("====================================================");
		//Can we execute 2 constructors when creating an Object?
		//Yes-it can be achieved using this()
		//this type of constructor calls is known as CONSTRUCTOR CHAINING
		
		ThisWithConstructor obj1=new ThisWithConstructor("Hello","Bye");
	}
}
