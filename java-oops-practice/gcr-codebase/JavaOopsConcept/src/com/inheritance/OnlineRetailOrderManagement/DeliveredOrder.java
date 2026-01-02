package com.inheritance.OnlineRetailOrderManagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeliveredOrder extends ShippedOrder {
	protected LocalDate deliveryDate;
	public DeliveredOrder(String orderId, String orderDate, String trackingNumber,String deliveryDate ) {
		super(orderId, orderDate, trackingNumber);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		this.deliveryDate = LocalDate.parse(deliveryDate,format);
	}
	
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Delivery Date " + deliveryDate);
	}
}
