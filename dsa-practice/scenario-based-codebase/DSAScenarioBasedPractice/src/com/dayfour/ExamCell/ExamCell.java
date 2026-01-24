package com.dayfour.ExamCell;

import java.util.ArrayList;

public class ExamCell {
	private ArrayList<Student> students;

	public ExamCell() {
		this.students = new ArrayList<Student>();
	}

	public void addStudentsFromCenter(ExamCenter e) {
		ArrayList<Student> centerStudents = e.getStudentsList();

		int size1 = students.size();
		int size2 = centerStudents.size();
		int idx1 = 0;
		int idx2 = 0;

		ArrayList<Student> newList = new ArrayList<Student>(size1 + size2);

		while (idx1 < size1 && idx2 < size2) {
			Student s1 = students.get(idx1);
			Student s2 = centerStudents.get(idx2);

			if (s1.compareTo(s2) <= 0) {
				newList.add(s1);
				idx1++;
			} else {
				newList.add(s2);
				idx2++;
			}
		}

		while (idx1 < size1) {
			newList.add(students.get(idx1++));
		}
		while (idx2 < size2) {
			newList.add(centerStudents.get(idx2++));
		}

		students = newList;
	}

	public void display(int num) {
		System.out.println("Rank list: ");
		if (num == 0 || Math.abs(num) >= students.size()) {
			ArrayList<Student> array = num < 0 ? (ArrayList<Student>) students.reversed() : students;
			for (Student student : array) {
				System.out.println(student);
			}
		} else if (num < 0) {
			int size = students.size();
			for (int i = size - 1; i >= size + num; i--) {
				System.out.println(students.get(i));
			}
		} else {
			for (int i = 0; i < num; i++) {
				System.out.println(students.get(i));
			}
		}
	}
}
