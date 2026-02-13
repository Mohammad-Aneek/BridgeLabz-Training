package com.csv.Advanced.CSVToObjects;

public class Student {
	String id;
	String name;
	int age;
	int marks;

	public Student(String id, String name, int age, int marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student[ID=" + id + ", Name=" + name + ", Marks=" + marks + "]";
	}
}
