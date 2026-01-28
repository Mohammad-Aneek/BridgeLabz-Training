package com.annotations.Advanced.Caching;

public class Main {

	public static void main(String[] args) throws Exception {
		Calculator calculator = new Calculator();

		int result = CacheManager.run(calculator, "square", 5);
		System.out.println("Result: " + result);
		CacheManager.run(calculator, "square", 5);
		System.out.println("Result: " + result);
	}

}
