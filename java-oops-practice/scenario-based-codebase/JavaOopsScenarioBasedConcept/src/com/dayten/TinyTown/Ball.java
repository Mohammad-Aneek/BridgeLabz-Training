package com.dayten.TinyTown;

public class Ball {
	private String id;
	private String color;
	private String size;

	public Ball(String id, String color, String size) {
		this.id = id;
		this.color = color;
		this.size = size;
	}

	public String getDetails() {
		return "Ball [ID=" + id + ", Color=" + color + ", Size=" + size + "]";
	}

	public String getId() {
		return id;
	}
}
