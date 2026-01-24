package com.dayfour.ExamCell;

import java.util.ArrayList;

public class ExamCenter {
	private ArrayList<Student> students;

	public ExamCenter() {
		this.students = new ArrayList<Student>();
	}

	public void addStudent(String name, int score) {
		if (students.isEmpty()) {
			students.add(new Student(name, score));
			return;
		}

		int i = 0;
		int j = students.size() - 1;

		Student s = new Student(name, score);

		while (i <= j) {
			int mid = i + (j - i) / 2;
			if (students.get(mid).compareTo(s) <= 0) {
				i = mid + 1;
			} else {
				j = mid - 1;
			}
		}

		students.add(i, s);
	}

	protected ArrayList<Student> getStudentsList() {
		return students;
	}
}
