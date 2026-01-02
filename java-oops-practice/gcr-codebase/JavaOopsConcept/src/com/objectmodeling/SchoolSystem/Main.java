package com.objectmodeling.SchoolSystem;

public class Main {
public static void main(String[] args) {
	Student s1 = new Student("Abhishek", "CS05");
    Student s2 = new Student("Aneek", "CS83");

    Course math = new Course("Information Technology");
    Course cs = new Course("Computer Science Engineering");

    School school = new School("Technocrats Institute of Technology");
    school.addStudent(s1);
    school.addStudent(s2);

    s1.enroll(math);
    s1.enroll(cs);
    
    cs.addStudent(s2); 

    System.out.println("School View");
    school.display();

    System.out.println("Abhishek's view");
    s1.display();
    
    System.out.println("Aneek's view");
    s2.display();

    System.out.println("Course View (CS)");
    cs.display();
}
}
