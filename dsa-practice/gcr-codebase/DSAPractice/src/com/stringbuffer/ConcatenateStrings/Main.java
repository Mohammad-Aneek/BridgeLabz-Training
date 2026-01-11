package com.stringbuffer.ConcatenateStrings;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.next();
		}
		System.out.println(ConcatenateStrings.ofArray(arr));
		input.close();
	}
}
