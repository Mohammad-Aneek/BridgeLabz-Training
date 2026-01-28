package com.annotations.Beginner.Marker;

class ReportSystem {
	@ImportantMethod
	public void generatePDF() {
		System.out.println("PDF Generated");
	}

	public void clearCache() {
		System.out.println("Cache Cleared");
	}

	@ImportantMethod
	public void sendEmail() {
		System.out.println("Email Sent");
	}
}