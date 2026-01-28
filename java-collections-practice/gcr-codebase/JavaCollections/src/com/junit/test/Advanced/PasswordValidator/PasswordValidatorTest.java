package com.junit.test.Advanced.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.main.Advanced.PasswordValidator.PasswordValidator;

class PasswordValidatorTest {

	PasswordValidator validator = new PasswordValidator();

	@Test
	void testValidPassword() {
		assertTrue(validator.isValid("Password123"));
	}

	@Test
	void testInvalidPasswords() {
		assertFalse(validator.isValid("short1"), "Too short");
		assertFalse(validator.isValid("alllowercase1"), "No uppercase");
		assertFalse(validator.isValid("NoDigitHere"), "No digit");
		assertFalse(validator.isValid(null), "Null password");
	}
}
