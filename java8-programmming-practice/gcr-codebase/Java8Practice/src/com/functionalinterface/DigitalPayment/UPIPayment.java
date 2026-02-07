package com.functionalinterface.DigitalPayment;

class UPIPayment implements DigitalPayment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using UPI.");
	}
}
