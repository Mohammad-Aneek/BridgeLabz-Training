package com.junit.test.Advanced.BankTransactions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.main.Advanced.BankTransactions.BankAccount;

class BankAccountTest {
	BankAccount account;

	@BeforeEach
	void setup() {
		account = new BankAccount(100.0);
	}

	@Test
	void testDeposit() {
		account.deposit(50.0);
		assertEquals(150.0, account.getBalance());
	}

	@Test
	void testWithdraw() {
		account.withdraw(40.0);
		assertEquals(60.0, account.getBalance());
	}

	@Test
	void testInvalidWithdrawal() {
		Exception exception = assertThrows(RuntimeException.class, () -> {
			account.withdraw(200.0);
		});
		assertEquals("Insufficient funds", exception.getMessage());
	}

}
