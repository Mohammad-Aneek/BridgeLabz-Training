package com.dayone.AmbulanceRoute;

public class Hospital {
	String name;
    boolean isBusy;
    Hospital next;

    public Hospital(String name) {
        this.name = name;
        this.isBusy = false;
    }
}
