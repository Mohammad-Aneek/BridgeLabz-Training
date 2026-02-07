package com.lamdaexpressions.ECommerce;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product("Laptop", 120000.00, 4));
		products.add(new Product("Smartphone", 80000.00, 5));
		products.add(new Product("Tablet", 30000.00, 3));

		Comparator<Product> byPriceAscencing = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());
		products.sort(byPriceAscencing);
		System.out.println("Products sorted by price (ascending):");
		products.forEach(System.out::println);

		Comparator<Product> byPriceDescending = (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice());
		products.sort(byPriceDescending);
		System.out.println();
		System.out.println("Products sorted by price (descending):");
		products.forEach(System.out::println);

		Comparator<Product> byRating = (p1, p2) -> Integer.compare(p2.getRating(), p1.getRating());
		products.sort(byRating);
		System.out.println();
		System.out.println("Products sorted by rating:");
		products.forEach(System.out::println);
	}
}
