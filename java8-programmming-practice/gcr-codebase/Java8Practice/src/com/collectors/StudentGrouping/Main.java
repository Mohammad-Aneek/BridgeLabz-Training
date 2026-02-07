package com.collectors.StudentGrouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
	List<Student> students = List.of(new Student("Alice", "A"), new Student("Bob", "B"),
		new Student("Charlie", "A"), new Student("David", "C"));

	Map<String, List<Student>> map = students.stream()
		.collect(Collectors.groupingBy(student -> student.gradeLevel));
	System.out.println(map);
    }
}
