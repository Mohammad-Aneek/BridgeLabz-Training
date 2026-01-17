package com.dayone.BrowserBuddy;

public class Main {

	public static void main(String[] args) {
		Window zen = new Window();
		zen.addNewTab("Google", "https://www.google.com");
		zen.display();

		zen.addNewTab("StackOverflow", "https://stackoverflow.com");
		zen.display(); // Focus is now on StackOverflow

		zen.openLink("Java Error Fix", "https://stackoverflow.com/questions/java-npe");
		zen.display();

		zen.openLink("Java Docs", "https://docs.oracle.com/java");
		zen.display();

		zen.goBack();
		zen.display();

		zen.goBack();
		zen.display();

		zen.goForward();
		zen.display();

		zen.closeCurrentTab();
		zen.display();

		zen.reopenClosedTab();
		zen.display();

		zen.goBack();
		zen.display();

		zen.closeCurrentTab();
		zen.display();

		zen.closeCurrentTab();
		zen.display();

	}

}
