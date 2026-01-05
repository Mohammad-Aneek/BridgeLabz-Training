package com.linkedlist.singlylinkedlist.InventoryManagementSystem;

import java.util.Scanner;

public class Main {
	private final Scanner input = new Scanner(System.in);
	private final ItemList inventory = new ItemList();

	public void insert(ItemList list) {
		System.out.println("\n--- Insertion Menu ---");
		System.out.println("1. Add at Beginning\n2. Add at End\n3. Add at Specific Position");
		System.out.print("Choice: ");
		int choice = input.nextInt();

		System.out.print("Enter Item ID: ");
		int id = input.nextInt();
		input.nextLine(); // consume newline
		System.out.print("Enter Item Name: ");
		String name = input.nextLine();
		System.out.print("Enter Price: ");
		double price = input.nextDouble();
		System.out.print("Enter Quantity: ");
		int qty = input.nextInt();

		switch (choice) {
		case 1 -> list.addItemAtBeginning(id, name, price, qty);
		case 2 -> list.addItemAtEnd(id, name, price, qty);
		case 3 -> {
			System.out.print("Enter position (0 to size): ");
			int pos = input.nextInt();
			list.addItemAtPosition(id, name, price, qty, pos);
		}
		default -> System.out.println("Invalid choice!");
		}
	}

	public void searchAndDisplay(ItemList list) {
		System.out.println("\n--- Search/Display Menu ---");
		System.out.println("1. Display All Items\n2. Search by ID\n3. Search by Name");
		System.out.print("Choice: ");
		int choice = input.nextInt();

		switch (choice) {
		case 1 -> list.displayItems();
		case 2 -> {
			System.out.print("Enter ID: ");
			list.displayItem(input.nextInt());
		}
		case 3 -> {
			System.out.print("Enter Name: ");
			input.nextLine(); // consume newline
			list.displayItem(input.nextLine());
		}
		default -> System.out.println("Invalid choice!");
		}
	}

	public void sortInventory(ItemList list) {
		System.out.println("\n--- Sort Menu ---");
		System.out.println("1. Name (A-Z)\n2. Name (Z-A)\n3. Price (Low-High)\n4. Price (High-Low)");
		System.out.print("Choice: ");
		int choice = input.nextInt();

		switch (choice) {
		case 1 -> list.sortName(true);
		case 2 -> list.sortName(false);
		case 3 -> list.sortPrice(true);
		case 4 -> list.sortPrice(false);
		default -> System.out.println("Invalid choice!");
		}
		System.out.println("Inventory sorted successfully.");
	}

	public void start() {
		System.out.println("=====================================");
		System.out.println("    Inventory Management System      ");
		System.out.println("=====================================");

		while (true) {
			System.out.println("\nChoose an option:");
			System.out.println(
					"1. Insert Item\n2. Delete Item\n3. Display/Search\n4. Update Quantity\n5. Sort Items\n6. Total Inventory Value\n7. Exit");
			System.out.print("Selection: ");
			int choice = input.nextInt();

			switch (choice) {
			case 1 -> insert(inventory);
			case 2 -> {
				System.out.print("Enter ID to delete: ");
				inventory.deleteItem(input.nextInt());
			}
			case 3 -> searchAndDisplay(inventory);
			case 4 -> {
				System.out.print("Enter ID: ");
				int id = input.nextInt();
				System.out.print("New Quantity: ");
				inventory.updateQuantity(id, input.nextInt());
			}
			case 5 -> sortInventory(inventory);
			case 6 -> System.out.println("\nTotal Value: $" + inventory.getTotalValue());
			case 7 -> {
				System.out.println("Program terminated.");
				return;
			}
			default -> System.out.println("Invalid option.");
			}
			System.out.println("-------------------------------------");
		}
	}

	public static void main(String[] args) {
		new Main().start();
	}
}
