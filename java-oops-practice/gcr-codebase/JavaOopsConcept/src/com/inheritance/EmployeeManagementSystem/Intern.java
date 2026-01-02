package com.inheritance.EmployeeManagementSystem;

public class Intern extends Employee {
private int duration ;
	
	public Intern(String name, String id, int salary, int duration) {
		super(name, id, salary);
		this.duration = duration;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Duration = " + duration + " Year");
	}
}
