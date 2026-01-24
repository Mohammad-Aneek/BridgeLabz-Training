package com.dayten.GeoMeasure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Line 1: ");
		System.out.print("x1: ");
		double x1 = scanner.nextDouble();
		System.out.print("y1: ");
		double y1 = scanner.nextDouble();
		System.out.print("x2: ");
		double x2 = scanner.nextDouble();
		System.out.print("y2: ");
		double y2 = scanner.nextDouble();

		Line line1 = new Line(x1, y1, x2, y2);

		System.out.println("Line 2: ");
		System.out.print("x1: ");
		x1 = scanner.nextDouble();
		System.out.print("y1: ");
		y1 = scanner.nextDouble();
		System.out.print("x2: ");
		x2 = scanner.nextDouble();
		System.out.print("y2: ");
		y2 = scanner.nextDouble();

		Line line2 = new Line(x1, y1, x2, y2);

		double len1 = line1.calculateLength();
		double len2 = line2.calculateLength();

		System.out.printf("Length of Line 1: %.2f%n", len1);
		System.out.printf("Length of Line 2: %.2f%n", len2);

		if (Double.compare(len1, len2) == 0) {
			System.out.println("Result: Both lines are equal in length.");
		} else if (len1 > len2) {
			System.out.println("Result: Line 1 is longer.");
		} else {
			System.out.println("Result: Line 2 is longer.");
		}

		scanner.close();
	}

}
