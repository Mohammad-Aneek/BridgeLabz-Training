package com.stringbuilder.RemoveDuplicates;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the string to reverse: ");
	String reversedString = RemoveDuplicate.usingStringBuilder(input.nextLine());
	System.out.println("The updated string is: " + reversedString);
	input.close();
}
}
