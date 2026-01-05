package com.dayone.EWalletApplication;

public class PersonalWallet extends Wallet {
	private double dailyLimit;

	public PersonalWallet(double amount, User user, boolean referralBonus, double dailyLimit) {
		super(amount, user, referralBonus);
		this.dailyLimit = dailyLimit;
	}

	@Override
	public boolean transferTo(User receiver, double amount) {
		if (super.getOwner() == receiver) {
			System.out.println("Illegal operation");
			return false;
		}
		
		if (amount > dailyLimit) {
			System.out.println("Transfer exceeds personal wallet limit.");
			return false;
		}

		if (super.transfer(receiver, amount)) {
			receiver.getWallet().deposit(amount);
			return true;
		} else {
			System.out.println("Insufficient funds.");
			return false;
		}
	}
	
	public boolean transferTo(Wallet receiverWallet, double amount) {
		return transferTo(receiverWallet.getOwner(), amount);
	}

}
