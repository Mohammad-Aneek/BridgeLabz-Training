package com.csv.Intermediate.SortBySalary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		String filePath = "src/com/files/csv/employees.csv";
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				int salary = Integer.parseInt(data[3].trim());

				employeeList.add(new Employee(data[0], data[1], data[2], salary));
			}

			Collections.sort(employeeList, (e1, e2) -> e2.salary - e1.salary);

			System.out.println("Top Highest Paid Employees:");
			int limit = Math.min(5, employeeList.size());
			for (int i = 0; i < limit; i++) {
				System.out.println(employeeList.get(i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
