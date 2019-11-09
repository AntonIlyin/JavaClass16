package com.class6;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	/*
	 * ask user to enter boolean value for sale
	 * if no sale->I am not shopping
	 * if sale->Check the price of the item
	 * based on the amount we will have to calculate the price after discount
	 * if price<20--> apply 10%
	 * if price between 20-100->20%
	 * if between 100-500->30%
	 * anything->50%
	 * AFter discount__ the price of the item reduce from__to_
	 */
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter boolean value for sale");
	boolean sale=inp.nextBoolean();
	double price;
	double discount;
	double finalPrice;
	if(!sale) {
		System.out.println("I am not shopping");
	}else  {
		System.out.println("Check the price of the item");
		price=inp.nextDouble();
	
	if(price<20) {
		discount=price*0.1;
	}else if (price>=20 && price<=100) {
		discount=price*0.2;
	}else if(price>=100 && price<=500) {
		discount=price*0.3;
	}else {
		discount=price*0.5;
		finalPrice=price-discount;
	}
	finalPrice=price-discount;
	 System.out.println("After discount "+ discount+ "the price of the item reduce from "+price+"to "+finalPrice);
	
}
}
}