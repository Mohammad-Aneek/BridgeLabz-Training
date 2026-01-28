package com.exceptions.ResourcesTry;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String fileName = sc.nextLine();
			System.out.println(fileName);
		}
	}
}
