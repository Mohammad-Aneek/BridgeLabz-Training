package com.csv.Basic.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String filePath = "src/com/files/csv/employees.csv";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			writer.write("ID,Name,Department,Salary");
			writer.newLine();

			writer.write("101,Alice Green,HR,60000");
			writer.newLine();

			writer.write("102,Bob Brown,IT,75000");
			writer.newLine();

			writer.write("103,Charlie Black,Sales,50000");
			writer.newLine();

			writer.write("104,David White,Finance,80000");
			writer.newLine();

			writer.write("105,Eve Blue,IT,72000");
			writer.newLine();

			System.out.println("Data written to " + filePath + " successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
