package com.dayfour.ZipZipMart;

public class Main {
	public static void main(String[] args) {
		ZipZipMart mart = new ZipZipMart();

		mart.addTransaction("01-25-2025", 50.00);
		mart.addTransaction("01-20-2025", 20.00);
		mart.addTransaction("01-25-2025", 15.00);
		mart.addTransaction("01-20-2025", 20.00);

		System.out.println("Before Sorting:");
		mart.display();

		mart.sort();

		System.out.println("\nAfter Sorting:");
		mart.display();
	}
}
