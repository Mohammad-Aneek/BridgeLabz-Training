package com.objectmodeling.BankAndAccount;

public class Main {
	public static void main(String[] args) {
        Bank unionBank = new Bank("Union Bank of India", "UBIN0532525");
        unionBank.displayBankDetails();

        Customer customer = new Customer("Abhishek", 22);
        customer.openAccount(unionBank); 
        customer.viewBalance();
        
        Bank stateBank = new Bank("State Bank of India", "SBIN0001308");
        stateBank.displayBankDetails();
        
        customer.openAccount(stateBank);
        customer.viewBalance();
	}
}
