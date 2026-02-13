package com.csv.Advanced.DeleteDuplicates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		String filePath = "src/com/files/csv/employeees.csv";

		HashSet<String> seenIds = new HashSet<String>();
		ArrayList<String> duplicates = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
			int rowNum = 1;

			while ((line = br.readLine()) != null) {
				rowNum++;
				String[] columns = line.split(",");

				if (columns.length > 0) {
					String id = columns[0].trim();

					if (!seenIds.add(id)) {
						duplicates.add("Row " + rowNum + ": ID " + id + " (" + columns[1] + ")");
					}
				}
			}

			if (duplicates.isEmpty()) {
				System.out.println("No duplicates found.");
			} else {
				System.out.println("Duplicate entries found:");
				for (String dup : duplicates) {
					System.out.println(dup);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
