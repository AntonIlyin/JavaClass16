package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		 
		String str1="HEllo";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str1==str2);
		
		String str3=new String("Bye");
		String str4=new String("Bye");
		
		 System.out.println("______________");
		
		System.out.println(str3.equals(str4));//true
		System.out.println(str3==str4 );
		
		System.out.println(str1.contains("zz"));
		
		System.out.println("========StartsWIth and EndWith============");
		
		String str5="Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		System.out.println("=====.Concat======");
		
		System.out.println(str5.concat(" and we have java class"));
		
		System.out.println("======.trim========");
		String str6="  It is sunny   ";
		System.out.println("Before triming: "+str6);
		System.out.println(str6.trim());
		
		System.out.println("=========Index Of and CharAt========");
		String str7="Tomorrow we will be done with String manipulation";
		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e',11));
		System.out.println(str7.indexOf("we"));
	System.out.println(str7.charAt(10));
	
		

	}

}
