package com.constructor.levelone;

class Person {
	private String name;
	private double weight;
	private double height;
	
	Person(){
		this("",0,0);
	}
	
	Person(String name, double weight, double height){
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	Person(Person object) {
		this(object.name, object.weight, object.height);
	}
	
	void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Weight: "+this.weight);
		System.out.println("Height: "+this.height);
	}
}
