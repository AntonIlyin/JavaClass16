package com.class19;

public class Task1 {

	/*
	 * 1)Create a method createEmail(). Based on provided users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * johnsnow@gmail.com or johnsnow@yahoo.com*
	 	 */
	
	String createEmail(String name,String lastName,String emailType) {
		
		String email;
		email=name+lastName+"@"+emailType+ ".com";
		return email;
	}
	public static void main(String[] args) {
		
		Task1 obj =new Task1();
		String e=obj.createEmail("Anton","Ilyin","gmail");
		  System.out.println(e);
	}
	 
}
