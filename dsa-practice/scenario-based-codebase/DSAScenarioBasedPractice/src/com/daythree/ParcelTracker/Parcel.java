package com.daythree.ParcelTracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Parcel implements Comparable<Parcel> {
	private String senderName;
	private String shippingAddress;
	private LocalDate expectedDeliveryDate;
	private Priority priority;

	public Parcel(String senderName, String shippingAddress, String date, Priority priority) {
		this.senderName = senderName;
		this.shippingAddress = shippingAddress;
		this.expectedDeliveryDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		this.priority = priority;
	}

	public String getAddress() {
		return shippingAddress;
	}

	@Override
	public int compareTo(Parcel o) {
		int priorityCompare = priority.compareTo(o.priority);

		if (priorityCompare != 0) {
			return priorityCompare;
		} else {
			return expectedDeliveryDate.compareTo(o.expectedDeliveryDate);
		}
	}

	@Override
	public String toString() {
		return "Parcel from " + senderName;
	}
}
