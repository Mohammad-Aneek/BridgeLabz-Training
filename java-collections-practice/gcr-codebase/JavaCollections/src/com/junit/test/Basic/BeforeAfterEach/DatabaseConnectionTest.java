package com.junit.test.Basic.BeforeAfterEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.main.Basic.BeforeAfterEach.DatabaseConnection;

class DatabaseConnectionTest {

	DatabaseConnection db;

	@BeforeEach
	void init() {
		db = new DatabaseConnection();
		db.connect();
	}

	@Test
	void testConnectionStatus() {
		assertTrue(db.isConnected());
	}

	@AfterEach
	void tearDown() {
		db.disconnect();
	}

}
