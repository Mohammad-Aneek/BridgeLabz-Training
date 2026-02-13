package com.jdbc.EmployeeManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagementSystem implements AutoCloseable {
	private Connection conn;
	private PreparedStatement addEmployee;
	private PreparedStatement viewAllEmployees;
	private PreparedStatement updateEmployee;
	private PreparedStatement deleteEmployee;
	private PreparedStatement searchEmployee;

	public ManagementSystem() throws SQLException {
		this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/company_db", "rvaneek", "");
		this.addEmployee = conn.prepareStatement("INSERT INTO employees (name, salary, department) VALUES (?, ?, ?);");
		this.viewAllEmployees = conn.prepareStatement("SELECT * FROM employees;");
		this.updateEmployee = conn.prepareStatement("UPDATE employees SET salary = ? WHERE id = ?;");
		this.deleteEmployee = conn.prepareStatement("DELETE FROM employees WHERE id = ?;");
		this.searchEmployee = conn.prepareStatement("SELECT * FROM employees WHERE name = ?;");
	}

	public void addEmployee(String name, double salary, String department) throws SQLException {
		addEmployee.setString(1, name);
		addEmployee.setDouble(2, salary);
		addEmployee.setString(3, department);
		addEmployee.executeUpdate();
	}

	public void viewAllEmployees() throws SQLException {
		ResultSet rs = viewAllEmployees.executeQuery();
		while (rs.next()) {
			System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Salary: "
					+ rs.getDouble("salary") + ", Department: " + rs.getString("department"));
		}
	}

	public boolean updateEmployeeSalary(int id, double newSalary) throws SQLException {
		updateEmployee.setDouble(1, newSalary);
		updateEmployee.setInt(2, id);
		int n = updateEmployee.executeUpdate();
		return n > 0;
	}

	public boolean deleteEmployee(int id) throws SQLException {
		deleteEmployee.setInt(1, id);
		int n = deleteEmployee.executeUpdate();
		return n > 0;
	}

	public int searchEmployeeByName(String name) throws SQLException {
		searchEmployee.setString(1, name);
		ResultSet rs = searchEmployee.executeQuery();
		if (rs.next()) {
			return rs.getInt("id");
		} else {
			return -1;
		}
	}

	@Override
	public void close() throws Exception {
		conn.close();
		addEmployee.close();
		viewAllEmployees.close();
		updateEmployee.close();
		deleteEmployee.close();
		searchEmployee.close();
	}
}
