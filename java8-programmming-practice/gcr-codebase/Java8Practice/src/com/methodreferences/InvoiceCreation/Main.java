package com.methodreferences.InvoiceCreation;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> transactionIds = new ArrayList<String>();
		transactionIds.add("T1001");
		transactionIds.add("T1002");
		transactionIds.add("T1003");
		transactionIds.add("T1004");

		transactionIds.stream().map(Invoice::new).forEach(System.out::println);
	}
}
