package com.junit.test.Basic.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.main.Basic.ExceptionHandling.Divide;

class DivideTest {
	@Test
	void testDivideException() {
		Divide math = new Divide();

		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
			math.divide(10, 0);
		});

		assertEquals("Division by zero is not allowed", exception.getMessage());
	}
}
