package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		 
		
		//Declare  2D  Array
		
		int [][] array =new int [3][4];
		//1 st row
		array [0][0]=44;
		array [0][1]=80;
		array[0][2]=33;
		array [0][3]=20;
		
		//2 nd row
		 array[1][0]=10;
		array [1][1]=5;
		array [1][2]=7;
		array [1][3]=8;
		
		//3 rd row
		 array[2][0]=10;
		array [2][1]=9;
		array [2][2]=70;
		array [2][3]=6;
		
		System.out.println(array[0][0]);
		System.out.println(array [1][3]);
		
		/*
		 * Task:
		 * Create 2D array of String with 2 rows and 3 columns
		 * 
		 */
		System.out.println("*********************");
		 int [][] numbers= {
				 
				 {8,7,5,3,8},
				 {1,5,6,4,9},
				 {3,6,8,0,7}
				 
		 };
		 
		 System.out.println(numbers[1][4]);
		 
		 //To identify the numbers of Rows
		 System.out.println("The numbers of Arrays are:="+numbers.length);
		 
		 //To identify the numbers of Columns/elements in that row
		 System.out.println("The numbers of Columns are:="+numbers[0].length);
		 
		 System.out.println("_____________________");
		 for(int i=0;i<numbers.length;i++) {
			 
			 for(int j=0;j<numbers[i].length;j++) {
				 System.out.print(numbers[i][j]);
				 
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
	}

}
