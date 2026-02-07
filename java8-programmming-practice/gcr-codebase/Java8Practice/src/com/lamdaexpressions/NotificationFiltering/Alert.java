package com.lamdaexpressions.NotificationFiltering;

public class Alert {
	private String type;
	private String message;

	Alert(String type, String message) {
		this.type = type;
		this.message = message;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "[" + type + "] " + message;
	}
}
