package com.jdbc.LibraryManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (ManagementSystem library = new ManagementSystem(); Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome to the Library Management System");
			while (true) {
				System.out.println("1. Add Author");
				System.out.println("2. Add Book");
				System.out.println("3. Add Student");
				System.out.println("4. Issue Book");
				System.out.println("5. Calculate Fine");
				System.out.println("6. Return Book");
				System.out.println("7. Exit");
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
				case 1 -> {
					System.out.print("Enter author name: ");
					String authorName = scanner.nextLine();
					System.out.print("Enter author age: ");
					int authorAge = scanner.nextInt();
					library.addAuthor(authorName, authorAge);
					System.out.println("Author added successfully!");
				}
				case 2 -> {
					System.out.print("Enter book title: ");
					String bookTitle = scanner.nextLine();
					System.out.print("Enter author ID: ");
					int authorId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter book category: ");
					String category = scanner.nextLine();
					library.addBook(bookTitle, authorId, category);
					System.out.println("Book added successfully!");
				}
				case 3 -> {
					System.out.print("Enter student name: ");
					String studentName = scanner.nextLine();
					System.out.print("Enter student age: ");
					int studentAge = scanner.nextInt();
					library.addStudent(studentName, studentAge);
					System.out.println("Student added successfully!");
				}
				case 4 -> {
					System.out.print("Enter book ID to issue: ");
					int bookIdToIssue = scanner.nextInt();
					System.out.print("Enter student ID to issue to: ");
					int studentIdToIssue = scanner.nextInt();
					library.issueBook(bookIdToIssue, studentIdToIssue);
					System.out.println("Book issued successfully!");
				}
				case 5 -> {
					System.out.print("Enter book ID to calculate fine for: ");
					int bookIdForFine = scanner.nextInt();
					System.out.print("Enter student ID to calculate fine for: ");
					int studentIdForFine = scanner.nextInt();
					library.calculateFine(bookIdForFine, studentIdForFine);
				}
				case 6 -> {
					System.out.print("Enter book ID to return: ");
					int bookIdToReturn = scanner.nextInt();
					System.out.print("Enter student ID returning the book: ");
					int studentIdToReturn = scanner.nextInt();
					library.returnBook(bookIdToReturn, studentIdToReturn);
					System.out.println("Book returned successfully!");
				}
				case 7 -> {
					System.out.println("Exiting the system. Goodbye!");
				}
				default -> {
					System.out.println("Invalid choice. Please try again.");
				}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
