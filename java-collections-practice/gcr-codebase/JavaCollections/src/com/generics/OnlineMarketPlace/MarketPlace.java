package com.generics.OnlineMarketPlace;

public class MarketPlace {
	public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
		double price = product.getPrice();
		double discountedPrice = price - (price * (percentage / 100));
		product.setDiscountedPrice(discountedPrice);
		System.out.println("Applied " + percentage + "% discount.");
	}
}
