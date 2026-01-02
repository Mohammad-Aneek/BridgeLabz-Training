package com.inheritance.EmployeeManagementSystem;

public class Manager extends Employee {
	private int teamSize ;
	public Manager(String name, String id, int salary,int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Team Size = " + teamSize);
	}
}
