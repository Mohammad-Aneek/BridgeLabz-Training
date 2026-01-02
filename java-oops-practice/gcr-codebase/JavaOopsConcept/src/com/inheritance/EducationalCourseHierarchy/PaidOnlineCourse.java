package com.inheritance.EducationalCourseHierarchy;

public class PaidOnlineCourse extends OnlineCourse {
	private double fee;
	private double discount;

	public PaidOnlineCourse(String courseName, int durationInMinutes, String platform, boolean isRecorded, double fee,
			double discount) {
		super(courseName, durationInMinutes, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}

	public void displayFeeDetails() {
		super.display();
		System.out.println("Fee: " + fee);
		System.out.println("Discount: " + discount + "%");
		System.out.println("Final Fee: " + (fee - (fee * discount / 100)));
	}
}
