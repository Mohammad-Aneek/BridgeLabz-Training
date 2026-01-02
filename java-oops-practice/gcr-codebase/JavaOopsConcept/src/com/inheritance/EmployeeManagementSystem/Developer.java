package com.inheritance.EmployeeManagementSystem;

public class Developer extends Employee {
	private String programmingLanguage ;
	public Developer(String name, String id, int salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Programming language= " + programmingLanguage);
	}
}
