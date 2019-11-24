package com.class21;

public class Employee {

	 
	/*
	 * 
	/*
	 * 1. CreateaClasscalledEmployee:
	 *  ● Create three variables eID , salary and set
	 * the CEO to “Sumair”
	 *  ● Create two objects of the class Employee
	 *  ● Set the
	 * value of eID, salary for each of the objects 
	 * ● Print out the eID , salary and
	 * CEO for each of the objects
	 */
	 
	int eId=5;
	  int salary=200;
	  static String CEO="Sumair";
	void printInfo() {
		System.out.println("Employee id: "+ eId + ",salary is: "+salary);
	}
public static void main(String[] args) {
	Employee.CEO="Sumair";
	
	Employee emp1=new Employee();
	emp1.printInfo();
	emp1.eId=5;
	emp1.salary=80000;
	//emp1.CEO="Sumair";
	
	
	emp1.printInfo();
	
	Employee emp2=new Employee();
	emp2.eId=8;
	emp2.salary=85000;
	//emp2.CEO="Sumair";
			emp2.printInfo();
	
		
		
	/*
	 *with default value
	Employee emp1=new Employee();
	emp1.eId=201;
	emp1.printInfo();
	
	Employee emp2=new Employee();
	emp2.printInfo();
	System.out.println("Lets change emp2");
	
	emp2.eId=3;
	emp2.salary=300;
	emp2.CEO="Asel";
	emp2.printInfo();
	emp1.printInfo();
	*/
	}
	
	
}
