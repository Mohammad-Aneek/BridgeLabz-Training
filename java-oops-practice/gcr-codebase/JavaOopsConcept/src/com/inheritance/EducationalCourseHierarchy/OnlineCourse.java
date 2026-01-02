package com.inheritance.EducationalCourseHierarchy;

public class OnlineCourse extends Course {
	protected String platform;
	protected boolean isRecorded;
	
	public OnlineCourse(String courseName, int durationInMinutes,String platform, boolean isRecorded) {
		super(courseName,durationInMinutes);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Platform: " + platform);
		System.out.println("Is Recorded: " + isRecorded);
	}
}
