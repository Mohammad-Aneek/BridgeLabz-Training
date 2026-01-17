package com.dayone.BrowserBuddy;

public class Tab {
	private TabNode currentNode;

	public Tab(String name, String url) {
		this.currentNode = new TabNode(name, url);
	}

	public void openLink(String name, String url) {
		TabNode newNode = new TabNode(name, url);
		currentNode.next = newNode;
		newNode.prev = currentNode;
		currentNode = currentNode.next;
	}

	public void goBack() {
		if (currentNode.prev != null) {
			currentNode = currentNode.prev;
		}
	}

	public void goForward() {
		if (currentNode.next != null) {
			currentNode = currentNode.next;
		}
	}

	public void display() {
		System.out.println("Title: " + currentNode.getTitle());
		System.out.println("URL: " + currentNode.getURL());
	}
}
