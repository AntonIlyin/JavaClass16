package RiplTasks;

public class Employee {

	/*
	 * 1. Complete the Employee.java class:

Include the following class variables:
* name(String)
* lastName(String)
* employeeId(int)
* startDate(String)
* salary(int)


Write two constructors:

* non-argument constructor
* parameterized constructor

Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.


Output:
 
null null 0 null 0
Joe Smith 12345 01/01/1970 35000
	 */
	 
	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	Employee(){
		
	}
	Employee(String employeeName,String employeeLastName,int id,String date,int money){
		name=employeeName;
		lastName=employeeLastName;
		employeeId=id;
		startDate=date;
		salary=money;
	}
	public static void main(String[] args) {
		Employee obj1=new Employee();
		Employee obj2=new Employee("Joe","Smith",12345,"01/01/1970",35000);
		obj1.m();
		obj2.m();
	}
	public void m() {
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
}
