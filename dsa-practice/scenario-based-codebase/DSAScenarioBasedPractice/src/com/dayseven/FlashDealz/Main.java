package com.dayseven.FlashDealz;

public class Main {
	public static void main(String[] args) {
		Sale sale = new Sale();

		sale.addProduct("TV", 20, 50000.0);
		sale.addProduct("Laptop", 10, 100000.0);
		sale.addProduct("Headphones", 50, 5500.0);
		sale.addProduct("Mouse", 5, 200.0);
		sale.addProduct("Phone", 30, 18000.0);

		sale.displayTopDeals(3);
	}
}
