package com.dayone.EWalletApplication;

public interface Transferrable {
	boolean transferTo(User receiver, double amount);
}
