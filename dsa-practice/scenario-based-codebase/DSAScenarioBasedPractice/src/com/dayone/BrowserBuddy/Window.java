package com.dayone.BrowserBuddy;

import java.util.ArrayList;
import java.util.Stack;

public class Window {
	private ArrayList<Tab> tabList;
	private Tab focusedTab;
	private Stack<Tab> historyStack;
	private Stack<Integer> positionStack;

	public Window() {
		this.tabList = new ArrayList<Tab>();
		this.historyStack = new Stack<Tab>();
		this.positionStack = new Stack<Integer>();
		focusedTab = null;
	}

	public void reopenClosedTab() {
		if (historyStack.size() == 0) {
			System.out.println("No tab to reopen");
			return;
		} else {
			Tab reopenedTab = historyStack.pop();
			int tabPosition = positionStack.pop();

			tabList.add(tabPosition, reopenedTab);
			focusedTab = reopenedTab;
			System.out.println("Tab reopened");
		}
	}

	public void addNewTab(String name, String url) {
		Tab newTab = new Tab(name, url);
		this.tabList.add(newTab);
		focusedTab = newTab;
		System.out.println("New Tab added");
	}

	// to close the currently focused tab
	public void closeCurrentTab() {
		// to check if any tab exists or not
		if (focusedTab == null) {
			System.out.println("No tab opened");
			return;
		}

		int currentPos = tabList.indexOf(focusedTab);

		if (currentPos == 0 && tabList.size() != 1) {
			focusedTab = tabList.get(1);
		} else if (tabList.size() == 1) {
			focusedTab = null;
		} else {
			focusedTab = tabList.get(currentPos - 1);
		}

		positionStack.push(currentPos);
		historyStack.push(tabList.remove(currentPos));
		System.out.println("Current tab closed");
	}

	public void closeTab(int pos) {
		if (focusedTab == null) {
			System.out.println("No tab opened");
			return;
		}

		if (pos > tabList.size() || pos < 1) {
			System.out.println("Invalid position");
			return;
		} else if (tabList.get(pos - 1) == focusedTab) {
			closeCurrentTab();
		} else {
			System.out.println("Tab closed for position " + pos);
			positionStack.push(pos - 1);
			historyStack.push(tabList.remove(pos - 1));
		}
	}

	public void openLink(String title, String url) {
		if (focusedTab == null) {
			addNewTab(title, url);
		}
		focusedTab.openLink(title, url);
		System.out.println("Link opened");

	}

	public void goBack() {
		if (focusedTab == null) {
			System.out.println("No tab opened");
		} else {
			focusedTab.goBack();
			System.out.println("gone back in history");
		}
	}

	public void goForward() {
		if (focusedTab == null) {
			System.out.println("No tab opened");
		} else {
			focusedTab.goForward();
			System.out.println("Gone forward in history");
		}
	}

	public void display() {
		if (focusedTab == null) {
			System.out.println("No tab opened");
		} else {
			focusedTab.display();
		}
	}
}
