package com.dayone.EWalletApplication;

public class Main {
	public static void main(String[] args) {
		// 1. Create Users
		User abhishek = new User("5", "Abhishek");
		User ansh = new User("24", "Ansh");
		
		Wallet anshWallet = new PersonalWallet(1000, ansh, true, 600);
		Wallet abhishekWallet = new BusinesWallet(0, abhishek, false, 0.15);
		
		anshWallet.transferTo(abhishek, 600);
		anshWallet.transferTo(abhishekWallet, 200);
		
		abhishekWallet.transferTo(ansh, 100);
		abhishekWallet.transferTo(abhishekWallet, 300);
		
		anshWallet.printHistory();
		abhishekWallet.printHistory();
	}
	
}
