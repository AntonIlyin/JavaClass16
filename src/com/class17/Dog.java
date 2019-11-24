package com.class17;

public class Dog {

	/*
	 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	 * Labrador with specific attributes and behaviours.
	
	 */
	
	String name;
	int size;
	boolean beauty;
	
	void bite() {
		System.out.println("You dog "+name+ "can bite you");
	}
	void bark() {
		System.out.println("Your dog size is: "+size);
	}
	public static void main(String []args) {
		
		Dog Husky=new Dog();
		Dog Buldog=new Dog();
		Dog Labrador=new Dog();
		
		Husky.name="Leila";
		Husky.size=15;
		Husky.beauty=true;
		Husky.bite();
		Husky.bark();
		
		Buldog.name="Sheila";
		Buldog.size=10;
		Buldog.beauty=false;
		Buldog.bite();
		Buldog.bark();
		
		Labrador.name="Corina";
		Labrador.size=15;
		Labrador.beauty=true;
		Labrador.bite();
		Labrador.bark();
	}
}
