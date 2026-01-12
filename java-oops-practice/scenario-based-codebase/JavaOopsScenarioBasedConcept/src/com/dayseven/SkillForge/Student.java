package com.dayseven.SkillForge;

public class Student extends User {

	public Student(String name, int id) {
		super(name, id, Role.Student);
	}

	@Override
	protected void addCourse(Course course) {
		if (!courses.contains(course)) {
			courses.add(course);
		}
	}

	@Override
	public void displayCourses() {
		if (courses.isEmpty()) {
			System.out.println("No courses enrolled by " + super.name);
		} else {
			System.out.println("Courses enrolled by " + super.name + " are:");
			for (Course course : courses) {
				System.out.println(course);
			}
		}
	}

	public boolean isEnrolled(Course course) {
		return courses.contains(course);
	}

}
