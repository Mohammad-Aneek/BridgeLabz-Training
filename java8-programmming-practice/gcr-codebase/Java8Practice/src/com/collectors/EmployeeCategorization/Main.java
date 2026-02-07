package com.collectors.EmployeeCategorization;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
	List<Employee> employees = Arrays.asList(new Employee("Alice", "Engineering", 90000),
		new Employee("Bob", "HR", 60000), new Employee("Charlie", "Engineering", 95000),
		new Employee("David", "Marketing", 70000), new Employee("Eve", "HR", 62000));

	employees.stream().collect(Collectors.groupingBy(e -> e.department, Collectors.averagingDouble(e -> e.salary)))
		.forEach((k, v) -> System.out.println(k + "->" + v));
    }
}
