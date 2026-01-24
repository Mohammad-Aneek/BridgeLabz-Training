package com.dayfour.ZipZipMart;

import java.util.ArrayList;

public class ZipZipMart {
	private ArrayList<Transaction> transactions;
	private boolean isSorted;

	public ZipZipMart() {
		this.transactions = new ArrayList<Transaction>();
		this.isSorted = false;
	}

	public void addTransaction(String date, double amount) {
		this.transactions.add(new Transaction(date, amount));
		this.isSorted = false;
	}

	public void sort() {
		if (!isSorted) {
			sort(0, transactions.size() - 1);
			this.isSorted = true;
		}
	}

	public void display() {
		System.out.println("Zip Zip mart report: ");
		for (Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}

	private void sort(int start, int end) {
		if (start >= end) {
			return;
		}

		int mid = start + (end - start) / 2;

		sort(start, mid);
		sort(mid + 1, end);
		merge(start, mid, end);
	}

	private void merge(int start, int mid, int end) {
		Transaction[] arr = new Transaction[end - start + 1];

		int left = start;
		int right = mid + 1;
		int i = 0;

		while (left <= mid && right <= end) {
			Transaction t1 = transactions.get(left);
			Transaction t2 = transactions.get(right);
			if (t1.compareTo(t2) <= 0) {
				arr[i++] = t1;
				left++;
			} else {
				arr[i++] = t2;
				right++;
			}
		}

		while (left <= mid) {
			arr[i++] = transactions.get(left);
			left++;
		}

		while (right <= end) {
			arr[i++] = transactions.get(right);
			right++;
		}

		for (i = 0; i < arr.length; i++) {
			transactions.set(i + start, arr[i]);
		}

	}
}
