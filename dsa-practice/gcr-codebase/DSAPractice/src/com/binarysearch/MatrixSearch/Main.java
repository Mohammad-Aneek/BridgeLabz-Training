package com.binarysearch.MatrixSearch;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5 }, { 10, 11, 16 }, { 23, 30, 34 } };
		System.out.println("Found 16? " + MatrixSearch.containsTarget(matrix, 16));
		System.out.println("Found 19? " + MatrixSearch.containsTarget(matrix, 19));
	}
}
