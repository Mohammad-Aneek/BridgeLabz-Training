package com.jdbc.BankingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagementSystem implements AutoCloseable {
	private Connection connection;
	private PreparedStatement addAccountStatement;
	private PreparedStatement debitStatement;
	private PreparedStatement creditStatement;
	private PreparedStatement checkBalanceStatement;
	private PreparedStatement viewTransactionsHistoryStatement;
	private PreparedStatement addTransaction;

	public ManagementSystem() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bank_db", "rvaneek", "");
		this.connection.setAutoCommit(false);
		addAccountStatement = connection.prepareStatement("INSERT INTO accounts (name, balance) VALUES (?, ?)");
		this.debitStatement = connection.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
		this.creditStatement = connection.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
		this.checkBalanceStatement = connection.prepareStatement("SELECT balance FROM accounts WHERE id = ?");
		this.viewTransactionsHistoryStatement = connection.prepareStatement(
				"SELECT sender.name AS sender_name, receiver.name AS receiver_name, amount, created_at AS timestamp FROM transaction_history AS transactions, accounts AS sender, accounts AS receiver WHERE transactions.sender_id = sender.id AND transactions.receiver_id = receiver.id AND (sender.id = ? OR receiver.id = ?)");
		this.addTransaction = connection.prepareStatement(
				"INSERT INTO transaction_history (sender_id, receiver_id, amount, created_at) VALUES (?, ?, ?, NOW())");
	}

	public void addAccount(String accountHolderName, double initialBalance) throws SQLException {

		addAccountStatement.setString(1, accountHolderName);
		addAccountStatement.setDouble(2, initialBalance);
		addAccountStatement.executeUpdate();
		connection.commit();
	}

	public boolean transferFunds(int senderId, int receiverId, double amount) throws SQLException {
		try {
			debitStatement.setDouble(1, amount);
			debitStatement.setInt(2, senderId);
			debitStatement.executeUpdate();

			creditStatement.setDouble(1, amount);
			creditStatement.setInt(2, receiverId);
			creditStatement.executeUpdate();

			addTransaction.setInt(1, senderId);
			addTransaction.setInt(2, receiverId);
			addTransaction.setDouble(3, amount);
			addTransaction.executeUpdate();

			connection.commit();
			return true;
		} catch (SQLException e) {
			connection.rollback();
			return false;
		}
	}

	public double checkBalance(int accountId) throws SQLException {
		checkBalanceStatement.setInt(1, accountId);
		ResultSet resultSet = checkBalanceStatement.executeQuery();
		if (resultSet.next()) {
			return resultSet.getDouble("balance");
		}
		return 0.0;
	}

	public void viewTransactionsHistory(int accountId) throws SQLException {
		viewTransactionsHistoryStatement.setInt(1, accountId);
		viewTransactionsHistoryStatement.setInt(2, accountId);
		ResultSet resultSet = viewTransactionsHistoryStatement.executeQuery();
		while (resultSet.next()) {
			String senderName = resultSet.getString("sender_name");
			String receiverName = resultSet.getString("receiver_name");
			double amount = resultSet.getDouble("amount");
			String timestamp = resultSet.getString("timestamp");
			System.out.println("-----------------------------------------------------");
			System.out.printf("Sender: %s %nReceiver: %s %nAmount: %.2f %nTimestamp: %s%n", senderName, receiverName,
					amount, timestamp);
			System.out.println("-----------------------------------------------------");
		}
	}

	@Override
	public void close() throws Exception {
		connection.close();
		addAccountStatement.close();
		debitStatement.close();
		creditStatement.close();
		checkBalanceStatement.close();
		viewTransactionsHistoryStatement.close();
	}
}
