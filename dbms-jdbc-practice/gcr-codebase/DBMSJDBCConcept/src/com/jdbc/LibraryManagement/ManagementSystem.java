package com.jdbc.LibraryManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagementSystem implements AutoCloseable {
	private Connection connection;
	private PreparedStatement addBookStatement;
	private PreparedStatement addAuthorStatement;
	private PreparedStatement addStudentStatement;
	private PreparedStatement issueBookStatement;
	private PreparedStatement returnBookStatement;
	private PreparedStatement fineStatement;

	public ManagementSystem() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/library_db", "rvaneek", "");
		addBookStatement = connection
				.prepareStatement("INSERT INTO books (title, author_id, category) VALUES (?, ?, ?)");
		addAuthorStatement = connection.prepareStatement("INSERT INTO authors (name, age) VALUES (?, ?)");
		addStudentStatement = connection.prepareStatement("INSERT INTO students (name, age) VALUES (?, ?)");
		issueBookStatement = connection.prepareStatement(
				"INSERT INTO borrowing_records (book_id, student_id, borrow_date, due_date) VALUES (?, ?, CURDATE(), DATE_ADD(CURDATE(), INTERVAL 14 DAY))");
		returnBookStatement = connection
				.prepareStatement("DELETE FROM borrowing_records WHERE book_id = ? AND student_id = ?");
		fineStatement = connection.prepareStatement(
				"SELECT DATEDIFF(CURDATE(), due_date) AS overdue_days FROM borrowing_records WHERE book_id = ? AND student_id = ?");
	}

	public void addBook(String title, int authorId, String category) throws SQLException {
		addBookStatement.setString(1, title);
		addBookStatement.setInt(2, authorId);
		addBookStatement.setString(3, category);
		addBookStatement.executeUpdate();
	}

	public void addAuthor(String name, int age) throws SQLException {
		addAuthorStatement.setString(1, name);
		addAuthorStatement.setInt(2, age);
		addAuthorStatement.executeUpdate();
	}

	public void addStudent(String name, int age) throws SQLException {
		addStudentStatement.setString(1, name);
		addStudentStatement.setInt(2, age);
		addStudentStatement.executeUpdate();
	}

	public void issueBook(int bookId, int studentId) throws SQLException {
		issueBookStatement.setInt(1, bookId);
		issueBookStatement.setInt(2, studentId);
		issueBookStatement.executeUpdate();
	}

	public void calculateFine(int bookId, int studentId) throws SQLException {
		fineStatement.setInt(1, bookId);
		fineStatement.setInt(2, studentId);
		var resultSet = fineStatement.executeQuery();
		if (resultSet.next()) {
			int overdueDays = resultSet.getInt("overdue_days");
			if (overdueDays > 0) {
				double fine = overdueDays * 5;
				System.out.println("Fine for book ID " + bookId + ": " + fine);
			} else {
				System.out.println("No fine for book ID " + bookId);
			}
		}
		fineStatement.close();
	}

	public void returnBook(int bookId, int studentId) throws SQLException {
		returnBookStatement.setInt(1, bookId);
		returnBookStatement.setInt(2, studentId);
		returnBookStatement.executeUpdate();
	}

	@Override
	public void close() throws Exception {
		connection.close();
		addBookStatement.close();
		addAuthorStatement.close();
		addStudentStatement.close();
		issueBookStatement.close();
		returnBookStatement.close();
	}
}
