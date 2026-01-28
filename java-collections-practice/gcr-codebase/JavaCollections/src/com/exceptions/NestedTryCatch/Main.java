package com.exceptions.NestedTryCatch;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 10, 20 };
		try {

			try {
				int val = arr[5];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index!");
			}

			int div = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
		}
	}
}
