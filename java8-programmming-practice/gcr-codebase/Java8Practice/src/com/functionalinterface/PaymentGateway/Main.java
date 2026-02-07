package com.functionalinterface.PaymentGateway;

public class Main {
	public static void main(String[] args) {
		PaymentProvider payment = new RazorPay();
		payment.processPayment(5000);
		payment.refund(5000);

		PaymentProvider gateway = new Paytm();
		gateway.processPayment(5000);
		gateway.refund(5000);

	}
}
