package com.generics.UniversitySystem;

class Course<T extends CourseType> {
	private String courseName;
	private T evaluationType;

	public Course(String courseName, T evaluationType) {
		this.courseName = courseName;
		this.evaluationType = evaluationType;
	}

	public void displayCourse() {
		System.out.println("Course: " + courseName);
		System.out.println("Type: " + evaluationType.getType());
	}
}
