package com.dayseven.EduResults;

import java.util.ArrayList;

public class District {
	protected ArrayList<Student> students;
	private String name;

	public District(String name) {
		this.name = name;
		this.students = new ArrayList<Student>();
	}

	public void addStudent(String studentName, int score) {
		Student newStudent = new Student(studentName, score, this.name);

		int i = students.size() - 1;
		for (; i >= 0; i--) {
			if (newStudent.compareTo(students.get(i)) >= 0) {
				break;
			}
		}
		students.add(i + 1, newStudent);
	}
}