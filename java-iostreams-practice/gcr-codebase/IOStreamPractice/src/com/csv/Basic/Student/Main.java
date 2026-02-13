package com.csv.Basic.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String filePath = "src/com/files/csv/students.csv";
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				System.out.println( data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
