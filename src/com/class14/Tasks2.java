package com.class14;

public class Tasks2 {

	public static void main(String[] args) {

		/*
		 * 1.Write a program to swap 2 numbers with out a temporary variable?Swap 2 strings without a
		 * temporary variable?
		 * 2.Write a java program to find the second largest number in the array?Maximum and
		 * minimum number in the array?
		 * 3.Find out how many alpha characters present in a
		 * string?
		 * 4.How to find out the part of the string from a string?What is substring?Find number
		 * of words in string?
		 * 5.Write a java program to reverse String? Reverse a string
		 * word by word?
		 * 6.Write a Java Program to find whether a String is palindrome or
		 * not?
		 * 7.Write a java program to check whether a given number is prime or
		 * not?
		 * 8.Write a Java Program to print first 10 numbers of Fibonacci series.
		 */

		//1.
		int x = 10;
		int y = 20;
		System.out.println("Before swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		 // Declare two strings 
        String a = "Hello"; 
        String b = "World"; 
          
        // Print String before swapping 
        System.out.println("Strings before swap: a = " +  
                                       a + " and b = "+b); 
          
        // append 2nd string to 1st 
        a = a + b; 
          
        // store intial string a in string b 
        b = a.substring(0,a.length()-b.length()); 
          
        // store initial string b in string a 
        a = a.substring(b.length()); 
          
        // print String after swapping 
        System.out.println("Strings after swap: a = " +  
                                     a + " and b = " + b);         
    

 
		System.out.println("+=======================++");
//2.
		
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
		int array[] = new int[]{10, 11, 88, 2, 12, 120};
		 
	    // Calling getMax() method for getting max value
	    int max = getMax(array);
	    System.out.println("Maximum Value is: "+max);
	 
	    // Calling getMin() method for getting min value
	    int min = getMin(array);
	    System.out.println("Minimum Value is: "+min);
	  }
	 
	  // Method for getting the maximum value
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	    
	    
	  } 
	  

 
}
