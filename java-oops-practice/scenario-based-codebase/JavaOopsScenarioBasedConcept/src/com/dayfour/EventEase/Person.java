package com.dayfour.EventEase;

public class Person {
	private String name;
	private String contact;

	public Person(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Contact: " + contact);
	}

}
