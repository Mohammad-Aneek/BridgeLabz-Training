package com.dayfour.EduMentor;

abstract class User {
	protected int id;
	protected String name;
	protected String email;

	public User(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public abstract void display();
}
