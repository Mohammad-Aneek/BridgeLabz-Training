package com.functionalinterface.DigitalPayment;

class CreditCardPayment implements DigitalPayment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using Credit Card (2% fee applied).");
	}
}
