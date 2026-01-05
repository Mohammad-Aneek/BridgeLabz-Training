package com.dayone.EWalletApplication;

public class User {
	private String id;
	private String name;
	private Wallet wallet;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
		this.wallet = null;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return String.format("%s (%s)", name, id);
	}
}
