package com.class12;

public class StringManupulationDemo2 {

	public static void main(String[] args) {
 
		//.contains();
		/*
		 * This method searches the sequence of characters in the String.
		 * If the sequnces of characters are found,
		 * then it returns true,otherwise returns false
		 */
String sentence="It was raining";
String sen="raining";
System.err.println(sen.contains(sentence));

System.out.println(sentence.contains("w"));


/*
 * Create two Strings and initialize them with some value.
 * implement the following methods on those strings.
 * 
 * sen.length();
 * sen.equals();
 * sen.toUpperCase();
 * sen.toLowerCase();
 * sen.equalsIgnoreCase(anotherString);
 */

String s="Hello";
String b="Bye";
System.out.println(s.length());
System.out.println(s.equals("Bye"));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.equalsIgnoreCase("Hello"));

System.out.println("***********************");

/*
 * .startsWith
 * This method tests if a String starts with the specified prefix beginning
 */

String str2="Its very hot in the class";
System.out.println("Is this string starting with ="+str2.startsWith("It"));
//System.out.println("Is this string starting with ="+str2.startsWith("Is,3));
System.out.println("_______-------------------------____________");
/*
 * .
 * This method tests if this string ends with the specified suffix
 */
System.out.println("Is this string ends with ="+str2.endsWith("class"));

System.out.println("**********************************");




	}

}