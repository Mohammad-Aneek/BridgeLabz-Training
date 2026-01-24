package com.daynine.TailorShop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order implements Comparable<Order> {
	int orderId;
	String customerName;
	LocalDateTime deliveryDateTime;

	public Order(int orderId, String customerName, String deliveryDateTime) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.deliveryDateTime = LocalDateTime.parse(deliveryDateTime, DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm"));
	}

	@Override
	public int compareTo(Order other) {
		return this.deliveryDateTime.compareTo(other.deliveryDateTime);
	}

	@Override
	public String toString() {
		return "Order #" + orderId + " [" + deliveryDateTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a"))
				+ "]";
	}
}
