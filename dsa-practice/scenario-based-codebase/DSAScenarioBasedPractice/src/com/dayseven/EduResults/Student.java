package com.dayseven.EduResults;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	private String districtName;

	public Student(String name, int score, String districtName) {
		this.name = name;
		this.score = score;
		this.districtName = districtName;
	}

	@Override
	public int compareTo(Student o) {
		// Descending order of score
		return o.score - this.score;
	}

	@Override
	public String toString() {
		return name + " (" + districtName + ") [" + score + "]";
	}
}
