package com.annotations.Advanced.Caching;

class Calculator {
	@CacheResult
	public int square(int num) {
		System.out.println("Calculating...");
		return num * num;
	}
}