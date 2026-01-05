package com.linkedlist.singlylinkedlist.StudentRecordManagement;

public class StudentNode {
	// Fields to store data
	private String rollNumber;
	private String name;
	private int age;
	private String grade;
	public StudentNode next;

	// constructor
	public StudentNode(String rollNumber, String name, int age) {
		this(rollNumber, name, age, null, null);
	}

	public StudentNode(String rollNumber, String name, int age, String grade, StudentNode next) {
		this.rollNumber = rollNumber.trim().toUpperCase();
		this.name = name.trim();
		this.age = age;
		this.grade = grade;
		this.next = next;
	}

	// to check for student with specific roll number
	public boolean hasRollNumber(String rollNumber) {
		return this.rollNumber.equals(rollNumber.trim().toUpperCase());
	}

	// to update grade
	public void setGrade(String grade) {
		this.grade = grade;
	}

	// to display info
	public void display() {
		System.out.println("Roll number: " + rollNumber);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Grade: " + grade);
		System.out.println();
	}

}
