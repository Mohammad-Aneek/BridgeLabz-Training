package com.dayeleven.DigiContact;

public class Main {

	public static void main(String[] args) {
		AddressBook abs = new AddressBook();
		abs.addContact();
		abs.addContact();
		abs.addContact();
		abs.displaySorted();
	}

}
