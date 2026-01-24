package com.dayfour.ExamCell;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int score;

	private static int counter = 0;

	public Student(String name, int score) {
		this.id = ++counter;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("ID: %d, Name: %s, Score: %d", id, name, score);
	}

	@Override
	public int compareTo(Student o) {
		return o.score - this.score;
	}
}
