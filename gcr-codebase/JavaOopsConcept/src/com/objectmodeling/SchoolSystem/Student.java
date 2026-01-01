package com.objectmodeling.SchoolSystem;

import java.util.ArrayList;

class Student {
	private String name;
    private String studentID;
    private ArrayList<Course> courses;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }
    
    public void enroll(Course course) {
    	if (!courses.contains(course)) {
			courses.add(course);
			course.addStudent(this);
		}
    }
    
    public String toString() {
    	return String.format("%s (%s)",name,studentID); 
    }
    
    public void display() {
    	System.out.println("----------------------------------------");
		System.out.println("Student name: " + this.name);
		System.out.println("----------------------------------------");

		for (Course course: courses) {
			System.out.println("- " + course);
		}
		System.out.println("----------------------------------------");
    }
}
