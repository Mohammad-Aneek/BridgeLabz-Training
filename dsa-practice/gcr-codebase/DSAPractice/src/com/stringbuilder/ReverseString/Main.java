package com.stringbuilder.ReverseString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string to reverse: ");
		String reversedString = Reverse.usingStringBuilder(input.nextLine());
		System.out.println("The reversed string is: " + reversedString);
		input.close();
	}
}
