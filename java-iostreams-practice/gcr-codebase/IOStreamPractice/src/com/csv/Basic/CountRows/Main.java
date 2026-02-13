package com.csv.Basic.CountRows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String filePath = "src/com/files/csv/employees.csv";
		int count = 0;
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			if (br.readLine() == null) {
				return;
			}

			while ((line = br.readLine()) != null) {
				if (!line.trim().isEmpty()) {
					count++;
				}
			}

			System.out.println("Total number of records: " + count);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
