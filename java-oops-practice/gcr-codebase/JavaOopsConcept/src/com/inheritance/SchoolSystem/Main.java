package com.inheritance.SchoolSystem;

public class Main {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Some Teacher", 38, "Some Subject");
        Student student = new Student("Some Student", 22, "Some Grade");
        Staff staff = new Staff("Some Staff", 40, "Some Department");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
	}

}
