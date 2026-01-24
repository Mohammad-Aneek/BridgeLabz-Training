package com.daynine.PayXpress;

public class Main {
	public static void main(String[] args) {
		ElectricityBill eb = new ElectricityBill(150.00, 20.00, "02-01-2026");
		InternetBill ib = new InternetBill(60.00, 10.00, "01-23-2026");
		WaterBill wb = new WaterBill(30.00, 5.00, "12-25-2025");

		eb.sendReminder();
		System.out.println();
		ib.sendReminder();
		System.out.println();
		wb.sendReminder();
		System.out.println();

		if (eb.pay(150.00, "01-15-2026")) {
			System.out.println("Electricity Bill Paid!");
		}

		if (!ib.pay(60.00, "01-24-2026")) {
			System.out.println("Penaly applicable!");
		}

		if (wb.pay(40, "01-15-2026")) {
			System.out.println("Water Bill Paid.");
		}

		WaterBill nextMonthWater = new WaterBill(wb);
		System.out.println();
		nextMonthWater.sendReminder();
	}

}
