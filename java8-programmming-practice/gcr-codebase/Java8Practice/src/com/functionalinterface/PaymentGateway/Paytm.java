package com.functionalinterface.PaymentGateway;

public class Paytm implements PaymentProvider {
	public void processPayment(double amount) {
		System.out.println("Paytm processed: " + amount);
	}

	@Override
	public void refund(double amount) {
		System.out.println("Paytm refund initiated for: " + amount);
	}
}
