package com.dayone.EWalletApplication;

public class BusinesWallet extends Wallet {
	private double taxRate;

	public BusinesWallet(double amount, User user, boolean referralBonus, double taxRate) {
		super(amount, user, referralBonus);
		this.taxRate = taxRate;
	}

	@Override
	public boolean transferTo(User receiver, double amount) {
		if (super.getOwner() == receiver) {
			System.out.println("Illegal operation");
			return false;
		}
		double tax = amount * taxRate;
		double totalDeduction = amount + tax;

		if (super.transfer(receiver, totalDeduction)) {
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
