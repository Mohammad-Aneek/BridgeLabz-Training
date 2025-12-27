package com.constructor.levelone;

class HotelBooking {
	private String guestName;
	private String roomType;
	private int nights;
	
	public HotelBooking() {
		this("John Doe", "Standard", 1);
	}
	
	public HotelBooking(HotelBooking object) {
		this(object.guestName, object.roomType, object.nights);
	}
	
	public HotelBooking(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	void display() {
		System.out.println("Name: " + this.guestName);
		System.out.println("Room type: " + this.roomType);
		System.out.println("Nights: " + this.nights);
	}
	
}
