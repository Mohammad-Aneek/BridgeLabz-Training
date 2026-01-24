package com.dayseven.EduResults;

public class Main {
	public static void main(String[] args) {
		ResultBoard board = new ResultBoard();

		District d1 = new District("District A");
		d1.addStudent("Alice", 90);
		d1.addStudent("Bob", 85);

		District d2 = new District("District B");
		d2.addStudent("Charlie", 95);
		d2.addStudent("Dave", 80);

		board.addDistrict(d1);
		board.addDistrict(d2);

		board.display();
	}
}
