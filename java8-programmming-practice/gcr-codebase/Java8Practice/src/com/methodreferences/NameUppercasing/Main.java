package com.methodreferences.NameUppercasing;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("John Doe");
		names.add("Jane Smith");
		names.add("Alice Johnson");
		names.add("Bob Brown");

		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
