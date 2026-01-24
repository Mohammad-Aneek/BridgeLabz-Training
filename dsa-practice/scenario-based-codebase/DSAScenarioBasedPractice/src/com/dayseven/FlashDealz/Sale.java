package com.dayseven.FlashDealz;

import java.util.ArrayList;
import java.util.Collections;

public class Sale {
	private ArrayList<Product> products;
	private boolean isSorted;

	public Sale() {
		this.products = new ArrayList<Product>();
		this.isSorted = true;
	}

	public void addProduct(String name, int discount, double price) {
		products.add(new Product(name, discount, price));
		isSorted = false;
	}

	public void displayTopDeals(int count) {
		if (!isSorted) {
			quickSort(0, products.size() - 1);
			isSorted = true;
		}

		System.out.println("--- Top Deals ---");
		int limit = Math.min(count, products.size());
		for (int i = 0; i < limit; i++) {
			System.out.println(products.get(i));
		}
	}

	private void quickSort(int low, int high) {
		if (low >= high) {
			return;
		}

		int pivot = low;
		int left = low + 1;
		int right = high;

		Product pivotValue = products.get(pivot);

		while (left <= right) {
			while (left <= right && pivotValue.compareTo(products.get(left)) >= 0) {
				left++;
			}

			while (left <= right && pivotValue.compareTo(products.get(right)) < 0) {
				right--;
			}

			if (left < right) {
				Collections.swap(products, left, right);
			}
		}

		Collections.swap(products, pivot, right);

		quickSort(low, right - 1);
		quickSort(right + 1, high);
	}
}