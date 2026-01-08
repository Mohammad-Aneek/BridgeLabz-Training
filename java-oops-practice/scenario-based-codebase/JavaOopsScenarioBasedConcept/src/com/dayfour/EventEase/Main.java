package com.dayfour.EventEase;

public class Main {

	public static void main(String[] args) {
		Person host = new Person("Aneek", "7880061935");

		Event bday = new BirthdayEvent("Peoples mall", "10-25-2025", host);
		Event conf = new ConferenceEvent("IT Park", "11-15-2025", host);

		bday.display(3000);

		conf.display(1000);

		bday.reschedule("12-25-2025");

		conf.cancel();
	}

}
