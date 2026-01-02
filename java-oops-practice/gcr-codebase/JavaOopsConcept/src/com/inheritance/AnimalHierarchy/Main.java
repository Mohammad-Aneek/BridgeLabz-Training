package com.inheritance.AnimalHierarchy;

public class Main {
	public static void main(String[] args) {
		Animal a1 = new Dog("Tommy", 3);
        Animal a2 = new Cat("purr", 2);
        Animal a3 = new Bird("Sweety", 3);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
	}
}
