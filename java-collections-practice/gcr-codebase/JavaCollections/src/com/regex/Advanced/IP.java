package com.regex.Advanced;

import java.util.Scanner;

public class IP {
	public static boolean isValidIP(String ip) {
		String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		String regex = "^" + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "$";
		return ip.matches(regex);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an IP address: ");
		String input = scanner.nextLine();
		if (isValidIP(input)) {
			System.out.println(input + " is a valid IP address.");
		} else {
			System.out.println(input + " is not a valid IP address.");
		}
	}
}
