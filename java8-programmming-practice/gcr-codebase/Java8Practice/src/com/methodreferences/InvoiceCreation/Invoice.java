package com.methodreferences.InvoiceCreation;

public class Invoice {
	private String transactionId;

	public Invoice(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "Invoice{id='" + transactionId + "'}";
	}
}
