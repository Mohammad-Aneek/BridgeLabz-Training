package com.objectmodeling.CompanyAndDepartments;

public class Employee {
	private String name;
	private final String ID;
	private String position;
	
	public Employee(String name, String position) {
		this.name = name;
		this.position = position;
		this.ID = "" + (int) (Math.random() * 90000 + 10000);
	}
	
	public void display() {
		System.out.println("----------------------------------------");
		System.out.println("Employee ID: " + this.ID);
		System.out.println("Employee name: " + this.name);
		System.out.println("Employee positionL " + this.position);
		System.out.println("----------------------------------------");
	}
}
