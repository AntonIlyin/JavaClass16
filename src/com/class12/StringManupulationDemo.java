package com.class12;

public class StringManupulationDemo {

	public static void main(String[] args) {
/*
 * There are two ways to create String objects
 * 
 * 1.String Literal
 */
		String name="John";		
		System.out.println(name);
		name.length();
		System.out.println("The length of name is = "+name.length());
		
		//2.Creating String with new key word
		String name1=new String("John1");

		/*
		 * This method returns the length of this String.
		 * The length is equal to the number
		 * of 16 bit Unicode characters in the String.
		 */
				int name1Len= name1.length();
				System.out.println("The length of name1Len is = "+name1Len);
				System.out.println("+++++++++++++++++++++++++++++");
		
				
				String str1="Hello world";
				System.out.println("Before:: "+str1);
				//to Lower case
			String	newValOfstr1=str1.toLowerCase();
			System.out.println("After:: "+newValOfstr1);
			System.out.println("***********************");
			
			//.equals
			String str2="HeLlo WoRld";
			boolean isEqual=str1.equals(str2);
			
			//.equalsIgnoreCase();
			System.out.println(str1.equalsIgnoreCase(str2));
			
			//To Upper case
			String str3="Mohammad";
			System.out.println("before: "+str3);
			str3=str3.toUpperCase();
			System.out.println("After: "+str3);
	}

}
