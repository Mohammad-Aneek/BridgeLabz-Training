package com.daytwo.CabbyGo;

public class Main {
	public static void main(String[] args) {
        Driver ansh = new Driver("Ansh", "1", 4.8);
        Vehicle myRide = new SUV("");

        CabbyGo app = new CabbyGo(myRide, ansh);
        app.display();
        System.out.println();
        app.bookRide("Anand Nagar", "Bhopal Airport");
        app.endRide(12.5);
    }
}
