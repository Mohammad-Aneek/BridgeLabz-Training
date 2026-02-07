package com.stream.Notification;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	List<String> emails = Arrays.asList("a@test.com", "b@test.com");

	emails.forEach(email -> System.out.println("Sending email to " + email));
    }
}
