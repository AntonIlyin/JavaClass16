package com.class17;

public class Phone {

	//public static void main(String[] args) {
		/*
		 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
		 * specific attributes and behaviours.
		 * 
		 * 
		 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
		 * Labrador with specific attributes and behaviours.
		 		 */
		
		//1.
		 
		String model,color,screen;
		int size,memory,price;
		
		void watchVideo(){
			System.out.println("You can watch video on "+model);
		}
		void call() {
			System.out.println("You can call");
		}
		
		void pay() {
			System.out.println("You can pay "+price);
		}
		public static void main(String[] args) {
			
			Phone Iphone=new Phone();
			Phone Android=new Phone();
			Phone Nokia=new Phone();
			
			Iphone.color="Black";
			Iphone.model="X";
			Iphone.size=45;
			Iphone.memory=120;
			Iphone.price=1000;
			Android.color="White";
			Android.model="YU";
			Android.size=20;
			Android.memory=120;
			Android.price=1000;
			Iphone.call();
			Iphone.pay();
			Iphone.watchVideo();
			Android.call();
			Android.pay();
			Android.watchVideo();
			Nokia.color="White";
			Nokia.model="YU";
			Nokia.size=20;
			Nokia.memory=120;
			Nokia.price=500;
			Nokia.call();
			Nokia.pay();
			Nokia.watchVideo();
		}
		 
		
		
		}
 

 
