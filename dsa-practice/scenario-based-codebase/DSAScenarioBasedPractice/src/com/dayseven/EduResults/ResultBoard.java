package com.dayseven.EduResults;

import java.util.ArrayList;

public class ResultBoard {
	private ArrayList<Student> allStudents;

	public ResultBoard() {
		this.allStudents = new ArrayList<Student>();
	}

	public void addDistrict(District district) {
		ArrayList<Student> districtList = district.students;
		ArrayList<Student> temp = new ArrayList<Student>();

		int ptr1 = 0, size1 = allStudents.size();
		int ptr2 = 0, size2 = districtList.size();

		while (ptr1 < size1 && ptr2 < size2) {
			if (allStudents.get(ptr1).compareTo(districtList.get(ptr2)) <= 0) {
				temp.add(allStudents.get(ptr1++));
			} else {
				temp.add(districtList.get(ptr2++));
			}
		}

		while (ptr1 < size1) {
			temp.add(allStudents.get(ptr1++));
		}

		while (ptr2 < size2) {
			temp.add(districtList.get(ptr2++));
		}

		this.allStudents = temp;
	}

	public void display() {
		System.out.println("--- State Rank List ---");
		for (Student s : allStudents) {
			System.out.println(s);
		}
	}
}
