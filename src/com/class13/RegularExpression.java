package com.class13;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
		 * print only text not numbers
		 */
		 
		String str="1234Hel125354lo188776";//Hello
		
		
		System.out.println(str.replaceAll("[0-9]",""));//Leave only text

		System.out.println(str.replaceAll("[a-zA-Z]",""));//Leave only numbers
		
		//Remove everything except text and numbers
		String str2="dfa78679679s0a#$%#^$";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));
		
		System.out.println("===================");
		
		System.out.println(str2.replaceAll("\\W",""));//another way to remove regular expression
		
		
	}

}
