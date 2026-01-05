package com.dayone.UniversityCourseEnrollment;

public class Faculty {
	private String id;
    private String facultyName;

    public Faculty(String facultyId, String facultyName) {
        this.id = facultyId;
        this.facultyName = facultyName;
    }
    
    public void displayInfo() {
    	System.out.println("Faculty ID: " + id);
        System.out.println("Faculty name: " + facultyName);
    }
}
