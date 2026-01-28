package com.junit.test.Advanced.TemperatureConvertor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.main.Advanced.TemperatureConvertor.TemperatureConverter;

class TemperatureConverterTest {
	TemperatureConverter converter = new TemperatureConverter();

	@Test
	void testConversions() {
		assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
		assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
		assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
	}

}
