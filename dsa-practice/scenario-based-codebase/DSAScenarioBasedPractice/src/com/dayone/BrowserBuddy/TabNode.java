package com.dayone.BrowserBuddy;

public class TabNode {
	private String title;
	private String url;
	TabNode prev;
	TabNode next;

	public TabNode(String title, String url) {
		this.title = title;
		this.url = url;
		this.next = null;
		this.prev = null;
	}

	public String getTitle() {
		return title;
	}

	public String getURL() {
		return url;
	}
}
