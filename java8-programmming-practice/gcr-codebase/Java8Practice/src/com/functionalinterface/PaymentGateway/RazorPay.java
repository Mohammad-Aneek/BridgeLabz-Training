package com.functionalinterface.PaymentGateway;

public class RazorPay implements PaymentProvider {
	public void processPayment(double amount) {
		System.out.println("Bank processed: " + amount);
	}
}
