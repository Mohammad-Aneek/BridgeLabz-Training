package com.inheritance.OnlineRetailOrderManagement;

public class ShippedOrder extends Order {
	protected String trackingNumber;
	
	public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	@Override
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Tacking number " + trackingNumber);
	}
}
