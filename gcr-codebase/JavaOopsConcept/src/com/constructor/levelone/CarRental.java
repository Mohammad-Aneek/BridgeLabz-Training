package com.constructor.levelone;

public class CarRental {
	private String customerName;
	private String carModel;
	private int rentalDays;
	
	public CarRental() {
		this.customerName = null;
		this.carModel = null;
		this.rentalDays = 0;
	}
	
	public CarRental(String customerName, String carModel, int rentalDays) {
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	
	public int calculateTotalCost() {
		if (rentalDays == 0) {
			return 0;
		}
		int cost = 300 + 100 * (rentalDays - 1);
		return cost;
	}
	
	public void showDetails() {
		System.out.println("Customer name: " + customerName);
		System.out.println("Car model: " + carModel);
		System.out.println("Rental days: " + rentalDays);
		System.out.println("Total cost: " + calculateTotalCost());
	}
}
