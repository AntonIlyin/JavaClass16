package com.class10;

public class TaskSwitchArray {

	public static void main(String[] args) {
		 
				
		String [] countries= {"Afganistan","Columbia","Usa","Turkey","Russia"};
		
		for(int i=0;i<countries.length;i++) {
		
			switch (countries[i]) {
			case "Afganistan":
				System.out.println("Kabul");
				break;
			case "Columbia":
				System.out.println("Bogota");
			break;
			case "Usa":
				System.out.println("Washington DC");
			break;
			case "Turkey":
				System.out.println("Ankara");
			break;
			case "Russia":
				System.out.println("Moscow");
			break;
			}
			
			
			
			
		}
	}

}
