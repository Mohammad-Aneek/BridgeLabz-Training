package com.dayone.UniversityCourseEnrollment;

public class UnderGraduate extends Student {
	
	public UnderGraduate(String id, String name) {
        super(id, name);
    }

    @Override
    void displayInfo() {
    	System.out.println("Undergraduate Student ID: " + id);
        System.out.println("Undergraduate Student name: " + name);
    }
}
