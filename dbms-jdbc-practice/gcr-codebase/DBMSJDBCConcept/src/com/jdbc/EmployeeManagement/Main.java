package com.jdbc.EmployeeManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (ManagementSystem ms = new ManagementSystem(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Employee Management System");
			while (true) {
				System.out.println(
						"\n1. Add Employee\n2. View All Employees\n3. Update Employee Salary\n4. Delete Employee\n5. Search Employee by Name\n6. Exit");
				System.out.print("Choose an option: ");
				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.print("Enter name: ");
					String name = sc.nextLine();
					System.out.print("Enter salary: ");
					double salary = sc.nextDouble();
					sc.nextLine();
					System.out.print("Enter department: ");
					String department = sc.nextLine();
					ms.addEmployee(name, salary, department);
					System.out.println("Employee added successfully.");
					break;
				case 2:
					ms.viewAllEmployees();
					break;
				case 3:
					System.out.print("Enter employee ID: ");
					int idToUpdate = sc.nextInt();
					System.out.print("Enter new salary: ");
					double newSalary = sc.nextDouble();
					if (ms.updateEmployeeSalary(idToUpdate, newSalary)) {
						System.out.println("Employee salary updated successfully.");
					} else {
						System.out.println("Employee not found.");
					}
					break;
				case 4:
					System.out.print("Enter employee ID: ");
					int idToDelete = sc.nextInt();
					if (ms.deleteEmployee(idToDelete)) {
						System.out.println("Employee deleted successfully.");
					} else {
						System.out.println("Employee not found.");
					}
					break;
				case 5:
					System.out.print("Enter name to search: ");
					String nameToSearch = sc.nextLine();
					int foundId = ms.searchEmployeeByName(nameToSearch);
					if (foundId != -1) {
						System.out.println("Employee found with ID: " + foundId);
					} else {
						System.out.println("Employee not found.");
					}
					break;
				case 6:
					System.out.println("Exiting...");
					return;
				default:
					System.out.println("Invalid option. Please try again.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
