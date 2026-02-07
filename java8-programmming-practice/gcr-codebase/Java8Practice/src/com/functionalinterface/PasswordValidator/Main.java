package com.functionalinterface.PasswordValidator;

public class Main {
	public static void main(String[] args) {
		String pass = "java8@code";

		if (SecurityUtils.isStrongPassword(pass)) {
			System.out.println("Password accepted.");
		} else {
			System.out.println("Password too weak.");
		}
	}
}
