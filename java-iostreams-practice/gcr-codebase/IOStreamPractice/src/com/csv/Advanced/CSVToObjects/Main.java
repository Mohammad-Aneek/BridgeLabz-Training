package com.csv.Advanced.CSVToObjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String file = "src/com/files/csv/students.csv";
		List<Student> students = new ArrayList<Student>();
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				Student s = new Student(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));

				students.add(s);
			}

			for (Student s : students) {
				System.out.println(s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
