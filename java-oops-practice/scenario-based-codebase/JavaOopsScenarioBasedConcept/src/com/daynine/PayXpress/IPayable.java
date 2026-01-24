package com.daynine.PayXpress;

public interface IPayable {
	boolean pay(double amount, String date);

	void sendReminder();
}
