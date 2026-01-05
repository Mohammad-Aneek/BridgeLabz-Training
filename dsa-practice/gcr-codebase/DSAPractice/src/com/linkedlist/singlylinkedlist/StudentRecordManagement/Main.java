package com.linkedlist.singlylinkedlist.StudentRecordManagement;

import java.util.Scanner;

public class Main {

	public void insert(StudentList list, Scanner input) {
		System.out.println("Choose one of the following: ");
		System.out.println("1. Insert at begining\n2. Insert at End\n3. Insert at pos");
		System.out.println();

		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		System.out.println();

		System.out.print("Enter the roll number of student: ");
		String rollNumber = input.next();
		System.out.print("Enter the name of student: ");
		input.nextLine();
		String name = input.nextLine().trim();
		System.out.print("Enter the age of student: ");
		int age = input.nextInt();

		if (age < 0) {
			System.out.println("Invalid age! Operation failed");
		}

		switch (choice) {
		case 1:
			list.addStudentAtBeginning(rollNumber, name, age);
			break;
		case 2:
			list.addStudentAtEnd(rollNumber, name, age);
			break;
		case 3:
			System.out.println("Enter the position to insert: ");
			int position = input.nextInt();
			list.addStudentAtPosition(rollNumber, name, age, position);
			break;
		default:
			System.out.println("Invalid option! Operation failed");
			break;
		}
	}



	public void display(StudentList list, Scanner input) {
		System.out.println("Choose one of the following: ");
		System.out.println("1. Display all\n2. Find Student");
		System.out.println();
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();

		System.out.println("-------------------------------------");

		switch (choice) {
		case 1:
			list.displayAll();
			break;
		case 2:
			System.out.print("Enter the roll number of student: ");
			String rollNumber = input.next();
			list.displayStudent(rollNumber);
		default:
			System.out.println("Invalid option! Operation failed");
			break;
		}
	}

	public void start() {
		StudentList list = new StudentList();
		Scanner input = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("     Student Management Program      ");
		System.out.println("-------------------------------------");

		while (true) {
			System.out.println("Choose one of the follwing : ");
			System.out.println("1. Insert\n2. Delete\n3. Display\n4. Update Grade\n5. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			int choice = input.nextInt();

			System.out.println("-------------------------------------");
			String rollNumber;
			switch (choice) {
			case 1:
				insert(list, input);
				break;
			case 2:
				System.out.print("Enter the roll number of student: ");
				rollNumber = input.next();
				list.deleteStudent(rollNumber);
				break;
			case 3:
				display(list, input);
				break;
			case 4:
				System.out.print("Enter the roll number of student: ");
				rollNumber = input.next();
				System.out.println("Enter thr grade: ");
				list.updateGrade(rollNumber, input.next());
				break;
			case 5:
				System.out.println("Program exited");
				return;
			default:
				System.out.println("Inavlid option");
				break;
			}
			System.out.println("-------------------------------------");

		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.start();

	}
}