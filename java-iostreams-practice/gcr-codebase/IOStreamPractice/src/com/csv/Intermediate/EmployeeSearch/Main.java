package com.csv.Intermediate.EmployeeSearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String filePath = "src/com/files/csv/employees.csv";
		String searchName = "Bob";
		String line;
		boolean found = false;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String name = data[1].trim();

				if (name.toLowerCase().contains(searchName.toLowerCase())) {
					System.out.println("Record Found!");
					System.out.println("Department: " + data[2]);
					System.out.println("Salary: " + data[3]);
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("Employee not found.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
