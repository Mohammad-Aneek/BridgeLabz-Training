package com.daytwo.MyBank;

public class Main {

	public static void main(String[] args) {
		Account mySavings = new SavingsAccount("1", 1000.0, 5.0);
        Account myCurrent = new CurrentAccount("2", 2000.0);

        mySavings.deposit(500);
        mySavings.calculateInterest();
        System.out.println("Final Balance: " + mySavings.checkBalance());
        System.out.println("------------------------------------------");
        myCurrent.withdraw(100);
        myCurrent.calculateInterest();
        System.out.println("Final Balance: " + myCurrent.checkBalance());

	}

}
