package com.dayone.UniversityCourseEnrollment;

public class PostGraduate extends Student {
	
	public PostGraduate(String id, String name, double gpa) {
        super(id, name, gpa);
    }

    @Override
    void displayInfo() {
    	System.out.println("Postgraduate Student ID: " + id);
        System.out.println("Postgraduate Student name: " + name);
    }
}
