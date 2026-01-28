package com.junit.main.Basic.ExceptionHandling;

public class Divide {
	public int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		return a / b;
	}
}
