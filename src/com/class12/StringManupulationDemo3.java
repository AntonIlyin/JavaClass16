package com.class12;

public class StringManupulationDemo3 {

	public static void main(String[] args) {
 
		/*
		 * .isEmpty
		 * 
		 * This method checks whether a String is empty or not
		 * This method returns true if the given string
		 * is empty, else it returns false
		 */
		
		String str="";
		System.out.println("Is this string empty= \n"+str.isEmpty());
		String str2="Hello";
		System.out.println("Is this string empty= "+str2.isEmpty());
		
		if(!str.isEmpty()) {
			System.out.println("This is not empty");
		}else {}
		System.out.println("This is empty String");
		
		
		System.out.println("**********************");
		
		 
		//\n-->creating new line
		String sentence="Each day has a promise to brighten up the day,\n but first you must allow the sun to come your way";
		System.out.println(sentence);
		System.out.println("**********************************");
		
		/*
		 * .concat
		 * This method appends one String to the end of another
		 * The method returns a String with the value of the
		 * String passed in to the method appended to the end 
		 * of the String used to invoke this method
		 */
		
		String str3="Hello ";
		String str4="World";
		System.out.println(str4+str3);
		System.out.println(str3.concat(str4));
		
		System.out.println("****************");
		
		/*
		 * .trim
		 * This method returns a copy of the String,
		 * with leading and trailing whitespace omitted.
		 */
		String str6=" How are you?";
		System.out.println(str6.trim());
		
		System.out.println("***************************");
		
		/*
		 * .charAt
		 * This method  returns the character located at the String' s specified index.
		 * The String indexes start from zero
		 */
		
		String str7="We might be done early today";
		System.out.println(str7.charAt(4));
		
		System.out.println("************************");
		
		/*
		 *.indexOf
		 *This method returns the index within this String of the
		 *first occurence of the specified character or -1
		 *if the character does not occur.
		 */
		String str8="We might mnot be done early";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('m',4));
		
		
	}
	 
	 
}
