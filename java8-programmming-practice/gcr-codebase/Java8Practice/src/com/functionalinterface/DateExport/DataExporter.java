package com.functionalinterface.DateExport;

public interface DataExporter {
	void exportCSV();

	default void exportJSON() {
		System.out.println("Default JSON export logic (Generic Format)");
	}
}
