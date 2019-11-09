package com.class5;
//to import short cut is: ctrl+shift+O-->for Windows
import java.util.Scanner;

public class MoreLogicalExamples {

	public static void main(String[] args) {
		 
		/*
		 * ask user to enter daily sales
		 * based on the sales range ew want to give commission to the person
		 * if sales is <100-->commissions is 10 %
		 * IF SALES IS BETWEEN 100-200-->commission of 20%
		 * e.t.c...
		 * 
		 */
		Scanner scan;
		double salesAmount;
		double commission;
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
salesAmount=scan.nextDouble();

if(salesAmount>=1 && salesAmount<100) {
	 
	//lets give user 10% commission of a sale
	commission=salesAmount*0.1;
	
}else if(salesAmount>=100 && salesAmount<200) {
	//lets give user 20% commission of a sale
	commission=salesAmount*0.2;
	
}else if(salesAmount>=200 && salesAmount<500) {
	//lets give user 30% commission of a sale
	commission=salesAmount*0.3;
}else if(salesAmount>=500) {
	//lets give user 50% commission of a sale
		commission=salesAmount*0.5;
	}else {
		commission=0;
		
	}
System.out.println("Based on the sales your commission is "+commission );
} 
	}


