package com.junit.test.Advanced.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.main.Advanced.UserRegistration.UserRegistration;

class UserRegistrationTest {
	UserRegistration registration = new UserRegistration();

	@Test
	void testSuccessfulRegistration() {
		assertTrue(registration.registerUser("john_doe", "john@example.com", "secure123"));
	}

	@Test
	void testFailedRegistration() {
		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser("john", "invalid-email", "123");
		});
	}

}
