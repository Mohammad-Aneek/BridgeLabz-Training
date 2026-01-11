package com.linearsearch.FirstNegative;

public class Main {
	public static void main(String[] args) {
		int[] data = { 10, 5, 2, -3, 8, -1 };
		int negativeIndex = FirstNegative.getIndex(data);
		
		if (negativeIndex == -1) {
			System.out.println("No negatives");
		} else {
			System.out.println("Negative at index " + negativeIndex + ": " + data[negativeIndex]);
		}
	}
}
