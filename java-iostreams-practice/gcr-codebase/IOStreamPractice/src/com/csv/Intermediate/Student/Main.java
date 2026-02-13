package com.csv.Intermediate.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String filePath = "src/com/files/csv/students.csv";
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			br.readLine();

			System.out.println("Students with Marks > 80:");
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				int marks = Integer.parseInt(data[3].trim());

				if (marks > 80) {
					System.out.println(data[1] + " (Marks: " + marks + ")");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
