package com.inheritance.AnimalHierarchy;

class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void makeSound() {
		System.out.println("Animal Sound");
	}
}
