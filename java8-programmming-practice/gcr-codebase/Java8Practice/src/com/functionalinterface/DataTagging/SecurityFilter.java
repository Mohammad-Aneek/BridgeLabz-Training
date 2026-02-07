package com.functionalinterface.DataTagging;

public class SecurityFilter {
	static void processData(Object data) {
		if (data instanceof Sensitive) {
			System.out.println("Encrypting sensitive data before sending...");
		} else {
			System.out.println("Sending data normally.");
		}
	}
}
