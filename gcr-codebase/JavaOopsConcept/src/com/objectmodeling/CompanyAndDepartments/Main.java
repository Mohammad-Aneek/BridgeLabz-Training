package com.objectmodeling.CompanyAndDepartments;

public class Main {

	public static void main(String[] args) {
		Company google = new Company("Google");

		google.addDepartment("Engineering");
		google.addDepartment("HR");
		google.addDepartment("Engineering"); // Duplicate

		google.addEmployee("Engineering", "Abhishek Pandey", "Lead Developer");
		google.addEmployee("Engineering", "Mohammad Abuzar", "QA Engineer");
		google.addEmployee("HR", "Khushi Pathak", "Recruiter");
		google.addEmployee("Marketing", "Arif Iqubal", "CMO"); // department does not exist

		google.display();
		google = null;

	}

}
