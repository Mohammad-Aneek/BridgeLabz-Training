package com.generics.WarehouseSystem;

import java.util.ArrayList;

public class Storage<T extends WarehouseItem> {
	private ArrayList<T> items;

	public Storage() {
		this.items = new ArrayList<T>();
	}

	public void addItem(T item) {
		items.add(item);
	}

	public T getItem(int index) {
		return items.get(index);
	}

	public ArrayList<T> getAllItems() {
		return items;
	}

}
