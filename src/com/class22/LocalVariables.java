package com.class22;

public class LocalVariables {

	public static void main(String[] args) {
		//I want to access variable myName from different method
		LocalVariables obj=new LocalVariables();
		obj.sayName();
		System.out.println("-----------------");
		//System.out.println(myName);
		String userEmail=obj.creatEmail("John","Smith","outlook");
		System.out.println(userEmail);
	}
	void sayName() {
		String myName="John";
		System.out.println(myName);
		//System.out.println(obj);-->wont be accessible, scope is only within main method
	}
	
	String creatEmail(String name,String lastName, String email) {
		String userEmail=name+lastName+"@"+email+".com";
		return userEmail;
		
	}
}
