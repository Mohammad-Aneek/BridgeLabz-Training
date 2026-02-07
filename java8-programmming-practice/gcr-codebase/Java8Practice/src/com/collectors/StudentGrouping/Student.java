package com.collectors.StudentGrouping;

public class Student {
    String name;
    String gradeLevel;

    public Student(String name, String gradeLevel) {
	this.name = name;
	this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
	return name + " (" + gradeLevel + ")";
    }
}
