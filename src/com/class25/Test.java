package com.class25;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Create an object of a Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		emp.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("Create an object of a Scrum class");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="product Backlog, Sprint Backlog,BurnDown chart";
		sm.ceremonies="Sprint demo,Planning,Retro,Daily Standup";
		sm.attendScrumMeetings();
	}
	
}
