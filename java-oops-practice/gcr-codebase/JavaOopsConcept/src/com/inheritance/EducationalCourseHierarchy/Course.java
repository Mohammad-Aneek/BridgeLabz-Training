package com.inheritance.EducationalCourseHierarchy;

import java.time.Duration;

public class Course {
	protected String courseName;
	protected Duration duration;
	
	public Course(String courseName, int durationInMinutes) {
		this.courseName = courseName;
		this.duration = Duration.ofMinutes(durationInMinutes);
	}
	
	public void display() {
		System.out.println("Course name: " + courseName);
		System.out.println("Duration: " + duration.toMinutes());
	}
}
