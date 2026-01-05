package com.linkedlist.singlylinkedlist.InventoryManagementSystem;

public class ItemNode {
	private int id;
	private String name;
	private double price;
	private int quantity;
	public ItemNode next;

	ItemNode(int id, String name, double price) {
		this(id, name, price, 1);
	}

	ItemNode(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int comparePrice(ItemNode node) {
		double compare = this.price - node.price;

		if (compare < 0) {
			return -1;
		} else if (compare > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public int compareName(ItemNode node) {
		return this.name.compareTo(node.name);
	}

	public boolean isID(int id) {
		return this.id == id;
	}

	public boolean isName(String name) {
		return this.name.equals(name);
	}

	public double getTotalPrice() {
		return price * quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void display() {
		System.out.println("Item name: " + name);
		System.out.println("Item id: " + id);
		System.out.println("Item price: " + price);
		System.out.println("Item quantity: " + quantity);
		System.out.println("Total price: " + getTotalPrice());
	}
}
