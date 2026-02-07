package com.collectors.OrderSummary;

public class Order {
    String customerId;
    double total;

    public Order(String customerId, double total) {
	this.customerId = customerId;
	this.total = total;
    }

    @Override
    public String toString() {
	return customerId + " : " + total;
    }
}
