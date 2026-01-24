package com.dayfour.ExamCell;

public class Main {
	public static void main(String[] args) {
		ExamCenter centerMumbai = new ExamCenter();
		ExamCenter centerPune = new ExamCenter();

		centerMumbai.addStudent("Amit", 85);
		centerMumbai.addStudent("Priya", 92);
		centerMumbai.addStudent("Rahul", 78);

		centerPune.addStudent("Sneha", 95);
		centerPune.addStudent("Vikram", 88);
		centerPune.addStudent("Anjali", 65);

		ExamCell stateCell = new ExamCell();

		stateCell.addStudentsFromCenter(centerMumbai);
		stateCell.addStudentsFromCenter(centerPune);

		System.out.println("Top 3:");
		stateCell.display(3);

		System.out.println("Bottom 2:");
		stateCell.display(-2);
	}
}
