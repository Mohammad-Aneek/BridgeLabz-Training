package com.annotations.CustomAnnotation.BugReport;

public class SoftwareModule {
	@BugReport(description = "Fix NullPointer on startup")
	@BugReport(description = "Optimize memory usage")
	public void feature() {
		System.out.println("Running Feature");
	}
}
