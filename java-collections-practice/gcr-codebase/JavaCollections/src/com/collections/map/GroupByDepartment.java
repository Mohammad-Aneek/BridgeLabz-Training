package com.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByDepartment {
	class Employee {
		String name;
		String department;

		Employee(String name, String department) {
			this.name = name;
			this.department = department;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	public static Map<String, ArrayList<Employee>> groupByDepartment(List<Employee> employees) {
		Map<String, ArrayList<Employee>> departmentMap = new HashMap<String, ArrayList<Employee>>();
		for (Employee emp : employees) {
			if (!departmentMap.containsKey(emp.department)) {
				departmentMap.put(emp.department, new ArrayList<Employee>());
			}
			departmentMap.get(emp.department).add(emp);
		}
		return departmentMap;
	}

	public static void main(String[] args) {
		GroupByDepartment gbd = new GroupByDepartment();
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(gbd.new Employee("Alice", "HR"));
		employees.add(gbd.new Employee("Bob", "IT"));
		employees.add(gbd.new Employee("Carol", "HR"));

		Map<String, ArrayList<Employee>> grouped = groupByDepartment(employees);

		System.out.println("Grouped by Department:" + grouped);
	}
}
