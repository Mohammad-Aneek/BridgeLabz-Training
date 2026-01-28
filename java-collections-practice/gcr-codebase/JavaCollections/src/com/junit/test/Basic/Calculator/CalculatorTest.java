package com.junit.test.Basic.Calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.main.Basic.Calculator.Calculator;

public class CalculatorTest {
	Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	void testOperations() {
		Assertions.assertAll(() -> Assertions.assertEquals(10, calculator.add(5, 5)),
				() -> Assertions.assertEquals(2, calculator.subtract(5, 3)),
				() -> Assertions.assertEquals(15, calculator.multiply(3, 5)));
	}

	@Test
	void testDivideByZero() {
		Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
	}

	@AfterEach
	void tearDown() {
		calculator = null;
	}
}