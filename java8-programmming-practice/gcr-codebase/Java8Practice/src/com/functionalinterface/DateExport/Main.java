package com.functionalinterface.DateExport;

public class Main {
	public static void main(String[] args) {
		ReportModule rm = new ReportModule();
		rm.exportCSV();
		rm.exportJSON();
	}
}
