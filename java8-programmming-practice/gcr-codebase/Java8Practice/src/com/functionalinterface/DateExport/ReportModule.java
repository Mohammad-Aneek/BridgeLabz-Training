package com.functionalinterface.DateExport;

public class ReportModule implements DataExporter {
	public void exportCSV() {
		System.out.println("Exporting to CSV...");
	}
}