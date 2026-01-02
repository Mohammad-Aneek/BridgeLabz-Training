package com.objectmodeling.UniversitySystem;

public class Main {
	public static void main(String[] args) {
        University university1 = new University("Technocrats Institute of technology");
        
        university1.addDepartment("Computer Science Engineering");
        university1.addDepartment("Electrical Engineering");
        
        Faculty professor1 = new Faculty("Dr. Alice Smith");
        Faculty professor2 = new Faculty("Dr. Bob Jones");
        Faculty professor3 = new Faculty("Dr. Charlie Brown");
        
        university1.assignFaculty("Computer Science Engineering", professor1);
        university1.assignFaculty("Electrical Engineering", professor2);
        university1.assignFaculty("Computer Science", professor3);
        university1.assignFaculty("Electrical Engineering", professor3);

        university1.displayDepartments();

        university1 = null;
        System.gc();
    }
}
