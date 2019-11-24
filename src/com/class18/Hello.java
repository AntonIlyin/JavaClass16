package com.class18;

public class Hello {

	 void sayHello(String name) {
		 
		 System.out.println("Hello "+ name);
		 
	 }

	 public static void main(String[] args) {
		
		 Hello obj=new Hello();
		 obj.sayHello("Anton");
		 obj.sayHello("Weqas");
		 obj.sayHello("Diego");
		 obj.sayHelloDifferentLanguage("USA");
		 obj.sayHelloDifferentLanguage("Russia");
		 obj.sayHelloDifferentLanguage("paraguay");
		 //obj.sayHelloDifferentLanguage(123);-->you will get time compile error
		 obj.sayNameAndAge("John",25);
		 obj.sayNameAndAge("Anton",33);
		 obj.isSnowing(true);//argument
		 obj.isSnowing(false);
		 
	}
	 
	 
	 /*
	  * Create a method that will say hello in different languages based
	  * on the value that will be passed when user calls a method
	  */
	 
	 void sayHelloDifferentLanguage(String country) {
		// String country="USA";
		 
		  
		 
		 
		 switch(country.toLowerCase()) {
		 case "USA":
			 System.out.println("Hello");
		 break;
		 
		 case "Russia":
			 System.out.println("Privet");
			 break;
		 case "Paraguay":
			 System.out.println("Hola");
			 break;
		 case "Albania":
		 System.out.println("Pershendetje");
		 break;
		 default:
			 System.out.println("I dont know how to say Hello in your language");
		 }
		 
		 
		 		 
	 }
	 
	//method to say name and age, //methodName (2 parameters: String,int)
	 void sayNameAndAge(String name, int age) {
		 
		 System.out.println("My name is "+name+ " and I am " +age+ " years old");
	 }
	 
	 //Create a method that will check if it snowing
	 //if snow-->stay home, otherwise go for a walk
	 
	 void isSnowing(boolean isSnowing) {//method header
//boolean isSnowing=false;
		 //method body
if(isSnowing) {
	System.out.println("Stay home");
}else {
	
	System.out.println("Go for a walk");
}
		 
	 
	 
	 }
	 }
