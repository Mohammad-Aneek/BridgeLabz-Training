package com.dayone.UniversityCourseEnrollment;

public class Main {
	public static void main(String[] args) {
		        Faculty faculty1 = new Faculty("1", "Dr. Alan Turing");
		        
		        Course javaCourse = new Course("1", "Java Programming");
		        Course aiCourse = new Course("2", "Artificial Intelligence");

		        faculty1.displayInfo();
		        System.out.println();

		        Student student1 = new UnderGraduate("UG1", "Student x");
		        Student student2 = new PostGraduate("PG1", "Student y", 3.5);

		        Enrollment enrollment1 = new Enrollment(student1, javaCourse, 85);
		        enrollment1.assignGrade();
		        enrollment1.display();
		        System.out.println("Transcript: " + student1.getTranscript());
		        System.out.println();
		        
		        Enrollment enrollment2 = new Enrollment(student2, aiCourse, 92);
		        enrollment2.display();
		        enrollment2.assignGrade();
		        System.out.println("Transcript: " + student2.getTranscript());
		    
	}

}
