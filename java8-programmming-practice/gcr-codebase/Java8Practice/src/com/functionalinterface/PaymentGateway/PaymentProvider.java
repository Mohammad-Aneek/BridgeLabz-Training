package com.functionalinterface.PaymentGateway;

public interface PaymentProvider {
	void processPayment(double amount);

	default void refund(double amount) {
		System.out.println("Refund feature not supported by this provider yet.");
	}
}
