package com.Workshop;

import java.time.LocalTime;

public interface TransportService {
    String getName();

    String getType();

    double getFare();

    LocalTime getDepartureTime();

    default void printServiceDetails() {
	System.out.println("Type: " + getType() + ", Name: " + getName() + ", Fare: " + getFare());
    }
}
