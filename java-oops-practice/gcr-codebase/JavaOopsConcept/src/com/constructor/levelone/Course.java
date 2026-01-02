package com.constructor.levelone;

class Course {
	private String courseName;
	private double duration;
	private double fee;
	private static String instituteName;
	
	public Course(String courseName, double duration, double fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	public void displayCourseDetails() {
		System.out.println("Course name: " + courseName);
		System.out.println("Duration: " + duration);
		System.out.println("Fee: " + fee);
		System.out.println("Institue name: " + instituteName);
	}
	
	public void updateInstitueName(String institueName) {
		Course.instituteName = institueName;
	}
}
