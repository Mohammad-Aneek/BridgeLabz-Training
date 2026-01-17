package com.daytwo.CallCenter;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
	private String name;
	private String phoneNumber;
	private Status status;

	public Customer(String name, String phoneNumber, Status status) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return name + " [" + phoneNumber + "]";
	}

	@Override
	public int compareTo(Customer o) {
		return this.status.compareTo(o.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phoneNumber);
	}
}
