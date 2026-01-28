package com.junit.test.Basic.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.junit.main.Basic.ParameterizedTest.Number;

class NumberTest {
	Number utils = new Number();

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 8, 10 })
	void testIsEvenWithEvenNumbers(int number) {
		assertTrue(utils.isEven(number));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 3, 5, 7, 9 })
	void testIsEvenWithOddNumbers(int number) {
		assertFalse(utils.isEven(number));
	}
}
