package com.csv.Advanced.CSVFromDataBase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String csvFile = "src/com/files/csv/db_export.csv";

		ArrayList<String[]> dbResults = fetchDataFromDatabase();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
			writer.write("Employee ID,Name,Department,Salary");
			writer.newLine();

			for (String[] row : dbResults) {
				String line = formatCsvRow(row);
				writer.write(line);
				writer.newLine();
			}

			System.out.println("Report generated successfully: " + csvFile);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String formatCsvRow(String[] data) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < data.length; i++) {
			String field = data[i];
			if (field.contains(",")) {
				field = "\"" + field + "\"";
			}
			sb.append(field);
			if (i < data.length - 1) {
				sb.append(",");
			}
		}
		return sb.toString();
	}

	private static ArrayList<String[]> fetchDataFromDatabase() {
		ArrayList<String[]> data = new ArrayList<String[]>();
		data.add(new String[] { "101", "Alice", "Engineering", "85000" });
		data.add(new String[] { "102", "Bob", "HR", "60000" });
		data.add(new String[] { "103", "Charlie", "Product", "95000" });
		return data;
	}
}
