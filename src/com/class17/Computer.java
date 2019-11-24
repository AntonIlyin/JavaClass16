package com.class17;

public class Computer {
	
	Boolean keyboard;
	String name,brand,monitor,mouse;
	int screen,memory,size,ram;
	
	
	//define behavior/actions
	void playGames() {//method header
		//method body
		System.out.println("I can play on my "+name);
	}
	void javaCoding() {
		System.out.println("I can do java coding on my "+name);
	}
	
	void watchMovie (){
		System.out.println("I can watch movie on my "+name);
	}
//////////////////////////////////////////////////////////////////////
	
	public static void main(String [] args) {
	
		Computer comp1=new Computer();
		comp1.brand="Apple";
		comp1.name="Macbook Pro";
		comp1.memory=250;
		System.out.println("I have "+comp1.brand+" " + comp1.name );
		comp1.javaCoding();
		comp1.watchMovie();
		
		
		
		
		
	}
}
