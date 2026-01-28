package com.junit.main.Advanced.DateFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
	public String formatDate(String inputDate) {
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(inputDate, inputFormatter);
		return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
}
