package com.csv.Advanced.Merge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		String file1 = "src/com/files/csv/students1.csv";
		String file2 = "src/com/files/csv/students2.csv";
		String outputFile = "src/com/files/csv/merged_students.csv";

		HashMap<String, String> studentInfo = new HashMap<String, String>();

		try {
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			br1.readLine();

			String line;
			while ((line = br1.readLine()) != null) {
				String[] data = line.split(",");
				studentInfo.put(data[0], data[1] + "," + data[2]);
			}
			br1.close();

			BufferedReader br2 = new BufferedReader(new FileReader(file2));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

			bw.write("ID,Name,Age,Marks,Grade");
			bw.newLine();

			br2.readLine();
			while ((line = br2.readLine()) != null) {
				String[] data = line.split(",");
				String id = data[0];
				String marksGrade = data[1] + "," + data[2];

				if (studentInfo.containsKey(id)) {
					String nameAge = studentInfo.get(id);

					bw.write(id + "," + nameAge + "," + marksGrade);
					bw.newLine();
				}
			}

			br2.close();
			bw.close();
			System.out.println("Files merged successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
