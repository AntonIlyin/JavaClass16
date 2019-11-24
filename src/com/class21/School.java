package com.class21;

import com.class20.*;//*-->means import all classes

public class School {

	public static void main(String[] args) {
		Student.school="Morning school";
		Student student0=new Student();
		student0.displayInfo();
		
		 
		Student student1=new Student();
		
		//assining instance variables
		student1.studentName="Eric";//student1.studentName-->called instance variable
		student1.GPA=3.95;
		student1.school="Syntax Technologies";
		
		Student student2=new Student();
		student2.studentName="Jaime";
		student2.GPA=3.90;
		student2.school="Syntax";
		student1.displayInfo();
		student2.displayInfo();
		System.out.println("student1 again");
		
		int hours=3;
		student1.displayInfo();
		student1.study(hours);
	 
		//int hour1=3, hour2;
		//hour1=4;
		
		
	}
}
