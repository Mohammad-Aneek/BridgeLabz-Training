package com.csv.Advanced.Validate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String file = "src/com/files/csv/users.csv";
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				if (data.length < 4) {
					System.out.println("Short row skipped");
					continue;
				}

				int rowNum = Integer.parseInt(data[0]);
				String name = data[1];
				String email = data[2];
				String phone = data[3];

				boolean isValid = true;

				if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
					System.out.println("ID " + rowNum + " email is invalid");
					isValid = false;
				}

				if (!phone.matches("\\d{10}")) {
					System.out.println("ID " + rowNum + " phone is invalid");
					isValid = false;
				}

				if (isValid) {
					System.out.println("ID " + rowNum + ", Name: " + name + " is valid");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
