package com.functionalinterface.DateUtility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateUtils {
	static String getInvoiceDate(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
	}
}
