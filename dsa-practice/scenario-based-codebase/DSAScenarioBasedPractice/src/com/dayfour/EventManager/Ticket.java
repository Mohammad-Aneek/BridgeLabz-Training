package com.dayfour.EventManager;

public class Ticket implements Comparable<Ticket> {
	private int id;
	private double price;
	private static int count = 0;

	public Ticket(double price) {
		this.id = ++count;
		this.price = price;
	}

	@Override
	public int compareTo(Ticket o) {
		if (this.price < o.price) {
			return -1;
		} else if (this.price > o.price) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return String.format("%.2f", price);
	}

}
