package com.inheritance.SchoolSystem;

public class Staff extends Person{
	private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
    	System.out.println("Role: Staff");
    	super.displayRole();
        System.out.println("Department: " + department);
    }
}
