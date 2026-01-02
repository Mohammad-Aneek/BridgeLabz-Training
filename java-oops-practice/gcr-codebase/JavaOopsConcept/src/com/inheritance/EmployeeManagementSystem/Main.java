package com.inheritance.EmployeeManagementSystem;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Manager("Abhishek", "1", 1_00_00_000, 30);
		Employee emp2 = new Developer("Aneek", "12", 10_00_000, "JAVA");
		Employee emp3 = new Intern("Ansh", "123", 1_00_000, 1);

		emp1.display();
		emp2.display();
		emp3.display();
	}
}
