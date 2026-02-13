package com.csv.Intermediate.SortBySalary;

public class Employee implements Comparable<Employee> {
	String id;
	String name;
	String department;
	int salary;

	public Employee(String id, String name, String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Salary: " + salary;
	}

	@Override
	public int compareTo(Employee o) {
		return o.salary - this.salary;
	}
}
