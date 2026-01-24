package com.dayeleven.DigiContact;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private ArrayList<Contact> contacts = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	public void addContact() {
		System.out.print("Enter First Name: ");
		String fname = scanner.nextLine();
		System.out.print("Enter Last Name: ");
		String lname = scanner.nextLine();

		for (Contact c : contacts) {
			if (c.getName().equalsIgnoreCase(fname + " " + lname)) {
				System.out.println("Contact already exists!");
				return;
			}
		}

		System.out.print("Phone: ");
		String phone = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("City: ");
		String city = scanner.nextLine();
		System.out.print("State: ");
		String state = scanner.nextLine();
		System.out.print("Zip: ");
		String zip = scanner.nextLine();

		contacts.add(new Contact(fname, lname, phone, email, new Address(city, state, zip)));
		System.out.println("Contact added successfully.");
	}

	public void displaySorted() {
		contacts.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}

	public void searchByCityOrState(String location) {
		for (Contact c : contacts) {
			if (c.getAddress().equals(location) || c.getAddress().equals(location)) {
				System.out.println(c);
			}
		}
	}

	public void deleteContact(String name) {
		for (Contact contact : contacts) {
			if (contact.getName().equalsIgnoreCase(name)) {
				contacts.remove(contact);
				System.out.println("Contact deleted successfully.");
				return;
			}
		}
	}

}
