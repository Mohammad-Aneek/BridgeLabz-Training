package com.daysix.TourMate;

public class Main {

	public static void main(String[] args) {
		Transport flight = new Transport("Air India", 22000);
		Transport bus = new Transport("Chartered bus", 1000);
		Hotel hotel = new Hotel("Taj Hotel", 50000);
		Hotel inn = new Hotel("Sands Inn", 1500);

		Passport myPassport = new Passport("Valid", true);
		Passport expiredPassport = new Passport("Invalid", false);

		DomesticTrip dt = new DomesticTrip("Goa", bus, inn, 3, 13000);
		dt.addActivity(new Activity("Paragliding", 3000));
		dt.showDetails();
		dt.book();
		
		System.out.println();

		InternationalTrip it1 = new InternationalTrip("Tokyo", flight, hotel, 5, 100000, myPassport);
		it1.addActivity(new Activity("City tour", 15000));
		it1.showDetails();
		it1.book();
		
		System.out.println();

		InternationalTrip it2 = new InternationalTrip("London", flight, hotel, 4, 72000, expiredPassport);
		it2.showDetails();
		it2.book();
	}

}
