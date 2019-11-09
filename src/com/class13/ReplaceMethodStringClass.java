package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {
		 
		/*
		 * .replace()
		 * This method returns a new String resulting
		 * from replacing all ocurrences of oldChar
		 * in this string with newChar
		 */
		
		String str="Hello Dear Dan, how are you Dan, How you been?";
		
		String str1="12-22-1990";//12/22/1990
		System.out.println(str.replace('e','z'));
		System.out.println("==========================");
		
		System.out.println(str.replace("Dear","Respected"));
		System.out.println(str.replaceFirst("Dan","Ali"));
	 
		System.out.println(str1.replace('-','/'));
		System.out.println(str1.replaceAll("-","/"));
		
		
		
		
		
		
		
		
	}

}
