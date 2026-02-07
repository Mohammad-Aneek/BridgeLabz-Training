package com.stream.InsuranceClaim;

class Claim {
	String id;
	String type;
	double amount;

	public Claim(String id, String type, double amount) {
		this.id = id;
		this.type = type;
		this.amount = amount;
	}
}