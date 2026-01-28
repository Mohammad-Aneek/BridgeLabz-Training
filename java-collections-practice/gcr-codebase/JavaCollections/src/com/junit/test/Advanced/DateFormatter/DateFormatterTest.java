package com.junit.test.Advanced.DateFormatter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.main.Advanced.DateFormatter.DateFormatter;

class DateFormatterTest {
	DateFormatter formatter = new DateFormatter();

	@Test
	void testFormatDate() {
		assertEquals("25-12-2023", formatter.formatDate("2023-12-25"));
	}

	@Test
	void testInvalidDateFormat() {
		assertThrows(Exception.class, () -> {
			formatter.formatDate("12-25-2023");
		});
	}
}
