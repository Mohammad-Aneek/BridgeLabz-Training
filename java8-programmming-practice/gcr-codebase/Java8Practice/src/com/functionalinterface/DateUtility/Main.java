package com.functionalinterface.DateUtility;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		System.out.println("Invoice Date: " + DateUtils.getInvoiceDate(LocalDate.now()));
	}
}
