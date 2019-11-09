package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// How to print numbers from 1 to 20
		
		int i=1;
		while(i<=20) {
			System.out.println(i);
			i++;
		}
//I want to print number from 10 to 30 all in one line
		
		int y=10;
		while(y<=30) {
			System.out.print(y+" ") ;
			y++;
		}
		//how to print values 10 to 1
		int a=10;
		while(a>=1) {
			System.out.println(a);
			a--;
		}
		//print values from 50 to 20
		int b=20;
		while(b>=20) {
			System.out.println(b);
			b--;
		}
		//I want to print all even numbers from 1 to 20 inclusive
		
		int z=2;
		while(z<=20) {
			System.out.println(z);
			z+=2;
			
		}
		System.out.println("--------------------------");
		//2 way using modulus
		int q=2;
		while(q<=20) {
		if (q%2==0) {
			System.out.println(q);
		}
			q++;
			System.out.println("****************");
			
			//Print only odd number from 50 to 100
			//Print only even numbers from 100 to 1
		}
		int w=51;
		while(w<=100) {
			if(w%2==1) {
				
			}
		}
		
	}

}
