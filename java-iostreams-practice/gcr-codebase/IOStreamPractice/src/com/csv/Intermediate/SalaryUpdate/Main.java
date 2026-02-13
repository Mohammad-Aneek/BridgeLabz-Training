package com.csv.Intermediate.SalaryUpdate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String inputFile = "src/com/files/csv/employees.csv";
		String outputFile = "src/com/files/csv/updated_employees.csv";
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			String header = br.readLine();
			bw.write(header);
			bw.newLine();

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				String dept = data[2];
				double salary = Double.parseDouble(data[3]);

				if (dept.equalsIgnoreCase("IT")) {
					salary = salary * 1.10;
				}

				String newRow = data[0] + "," + data[1] + "," + data[2] + "," + (int) salary;

				bw.write(newRow);
				bw.newLine();
			}

			System.out.println("Updated records saved to " + outputFile);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
