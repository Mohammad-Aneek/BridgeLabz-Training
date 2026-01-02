package com.inheritance.EmployeeManagementSystem;

public class Employee {
	protected String name;
	protected String id;
	protected int salary;
	
	public Employee(String name,String id,int salary) {
		this.name= name;
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Employee name: " + this.name);
		System.out.println("Employee ID: " + this.id);
		System.out.println("Salary: " + this.salary);
	}
}
