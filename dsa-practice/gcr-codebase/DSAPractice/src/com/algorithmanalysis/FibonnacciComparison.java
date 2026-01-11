package com.algorithmanalysis;

public class FibonnacciComparison {
	public static int fibonacciRecursive(int n) {
		if (n <= 1)
			return n;
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static int fibonacciIterative(int n) {
		int a = 0, b = 1, sum;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}

	public static void main(String[] args) {
		int N = 40;

		long start = System.nanoTime();
		fibonacciRecursive(N);
		System.out.println("Recursive: " + (System.nanoTime() - start));

		start = System.nanoTime();
		fibonacciIterative(N);
		System.out.println("Iterative: " + (System.nanoTime() - start));
	}

}
