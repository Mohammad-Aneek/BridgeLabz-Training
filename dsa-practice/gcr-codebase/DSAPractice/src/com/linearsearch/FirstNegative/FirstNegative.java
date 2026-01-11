package com.linearsearch.FirstNegative;

public class FirstNegative {
	public static int getIndex(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return i;
			}
		}
		return -1;
	}
}
