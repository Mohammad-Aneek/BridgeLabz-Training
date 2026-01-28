package com.exceptions.MultipleCatch;

public class Main {
	public static void main(String[] args) {
		int[] arr = null;
		try {
			System.out.println(arr[5]);
		} catch (NullPointerException e) {
			System.out.println("Array is not initialized!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index!");
		}
	}
}
