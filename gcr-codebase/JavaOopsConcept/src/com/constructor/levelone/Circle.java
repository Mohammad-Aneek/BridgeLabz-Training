package com.constructor.levelone;

public class Circle {
	private double radius;
	
	Circle(){
		this(0);
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void display() {
		System.out.println("The radius of circle is " + radius);
	}
}
