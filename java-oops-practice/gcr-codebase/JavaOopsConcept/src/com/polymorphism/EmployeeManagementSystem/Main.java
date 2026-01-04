package com.polymorphism.EmployeeManagementSystem;

public class Main {
	public static void main(String[] args) {
		Employee emp1= new FullTimeEmployee("1", "Abhishek", 8_00_000, 10);
		Employee emp2 = new PartTimeEmployee("2", "Aneek", 10_000, 125);
		
		emp1.assignDepartment("IT");
		emp2.assignDepartment("Testing");
		
		emp1.displayDetails();
		System.out.println();
		emp2.displayDetails();
	}
}
