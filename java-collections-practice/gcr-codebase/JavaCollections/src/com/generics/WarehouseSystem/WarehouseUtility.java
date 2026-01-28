package com.generics.WarehouseSystem;

import java.util.ArrayList;

public class WarehouseUtility {
	public static void printInventory(ArrayList<? extends WarehouseItem> items) {
		for (WarehouseItem item : items) {
			item.displayDetails();
		}
	}
}
