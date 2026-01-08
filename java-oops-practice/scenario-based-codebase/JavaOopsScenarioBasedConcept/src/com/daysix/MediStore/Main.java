package com.daysix.MediStore;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Tablet paracetamol = new Tablet("paracetamol", 5.0, "12-31-2026");
        Syrup coughSyrup = new Syrup("cough syrup", 40.0, "01-15-2022");
        Injection insulin = new Injection("insulin", 150.0, "06-20-2025");

        paracetamol.addStock(50);
        
        double saleAmount = paracetamol.sell(10); 
        
        if (saleAmount != -1) {
            System.out.println("Sold Aspirin. Revenue: " + saleAmount);
        } else {
            System.out.println("Sale failed.");
        }

        System.out.println("Discounted price for Insulin: " + insulin.getDiscountedPrice(10));

        paracetamol.checkExpiry(LocalDate.now());
        coughSyrup.checkExpiry(LocalDate.now());
        insulin.checkExpiry(LocalDate.now());
	}

}
