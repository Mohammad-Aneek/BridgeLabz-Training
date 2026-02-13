package com.csv.Advanced.Large;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String filePath = "src/com/files/csv/large_data.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			List<String> batch = new ArrayList<>(100);

			br.readLine();
			int totalProcessed = 0;

			while ((line = br.readLine()) != null) {
				batch.add(line);

				if (batch.size() == 100) {
					processBatch(batch);
					totalProcessed += batch.size();
					batch.clear();
				}
			}

			if (!batch.isEmpty()) {
				processBatch(batch);
				totalProcessed += batch.size();
			}

			System.out.println("Processing Complete. Total Records: " + totalProcessed);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void processBatch(List<String> records) {
		for (String record : records) {
			System.out.println("Processed: " + record);
		}
	}
}
