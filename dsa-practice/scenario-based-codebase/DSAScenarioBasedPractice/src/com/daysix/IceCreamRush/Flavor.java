package com.daysix.IceCreamRush;

public class Flavor {
	String name;
	int salesCount;

	public Flavor(String name, int salesCount) {
		this.name = name;
		this.salesCount = salesCount;
	}

	@Override
	public String toString() {
		return name + " [" + salesCount + "]";
	}
}
