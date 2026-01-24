package com.daysix.IceCreamRush;

public class Shop {
	private Flavor[] flavors;
	private int count;

	public Shop(int size) {
		this.flavors = new Flavor[size];
		this.count = 0;
	}

	public boolean addFlavor(String name, int salesCount) {
		if (count == flavors.length) {
			return false;
		}

		flavors[count++] = new Flavor(name, salesCount);
//		sort();
		return true;
	}

	public void display() {
		System.out.println("Menu: ");
		for (Flavor flavor : flavors) {
			System.out.println(flavor);
		}
	}

	public void sort() {
		for (int i = 0; i < count - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < count - i - 1; j++) {
				if (flavors[j].salesCount < flavors[j + 1].salesCount) {
					Flavor temp = flavors[j];
					flavors[j] = flavors[j + 1];
					flavors[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}
	}
}
