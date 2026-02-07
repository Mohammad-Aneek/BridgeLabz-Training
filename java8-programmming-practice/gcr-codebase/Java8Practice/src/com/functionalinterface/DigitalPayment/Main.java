package com.functionalinterface.DigitalPayment;

public class Main {
	public static void main(String[] args) {
		DigitalPayment payment = new UPIPayment();
		payment.pay(1500.00);

		DigitalPayment cardPayment = new CreditCardPayment();
		cardPayment.pay(2500.00);
	}
}
