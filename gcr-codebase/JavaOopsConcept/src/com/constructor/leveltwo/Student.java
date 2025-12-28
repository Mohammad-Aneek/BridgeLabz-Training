package com.constructor.leveltwo;

class Student {
	public int rollNumber;
	protected String name;
	private double CGPA;
	
	public Student(int rollNumber, String name, double CGPA) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	public double getCGPA() {
		return this.CGPA;
	}
	
	public void updateCGPA(double CGPA) {
		if (CGPA < 0 || 10 < CGPA ) {
			System.out.println("Invalid CGPA value");
			return;
		}
		this.CGPA = CGPA;
	}
	
}
