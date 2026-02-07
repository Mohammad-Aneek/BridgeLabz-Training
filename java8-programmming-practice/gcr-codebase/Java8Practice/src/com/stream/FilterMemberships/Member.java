package com.stream.FilterMemberships;

import java.time.LocalDate;

class Member {
	String name;
	LocalDate expiryDate;

	public Member(String name, String expiryDateStr) {
		this.name = name;
		this.expiryDate = LocalDate.parse(expiryDateStr);
	}

	public String toString() {
		return name + " (Expires: " + expiryDate + ")";
	}
}