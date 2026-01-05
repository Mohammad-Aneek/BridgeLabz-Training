package com.dayone.UniversityCourseEnrollment;

public class Course {
	private String courseCode;
    private String courseName;
    
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    
    public void displayCourse() {
    	System.out.println("Course name: " + courseName);
    	System.out.println("Course code: " + courseCode);
    }
}
