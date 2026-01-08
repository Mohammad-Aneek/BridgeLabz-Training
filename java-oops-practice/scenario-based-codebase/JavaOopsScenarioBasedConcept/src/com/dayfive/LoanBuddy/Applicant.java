package com.dayfive.LoanBuddy;

import java.util.ArrayList;
import java.util.List;

public class Applicant {
	private String name;
	private int creditScore;
	private List<LoanApplication> myLoans = new ArrayList<>();

	public Applicant(String name, int creditScore) {
		this.name = name;
		this.creditScore = creditScore;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void applyForLoan(LoanApplication loan) {
		if (myLoans.size() == 3) {
			System.out.println("Too many loans");
			return;
		}

		if (loan.approveLoan(this)) {
			myLoans.add(loan);
			System.out.println("Loan approved.");
		} else {
			System.out.println("Loan rejected.");
		}
	}
	
	public void closeLoan(int index) {
		if (getLoan(index).isPaid()) {
			myLoans.remove(index);
			System.out.println("Loan closed successfully");
		} else {
			System.out.println("Cannot close Loan");
		}
	}

	public LoanApplication getLoan(int index) {
		if (index >= 0 && index < myLoans.size()) {
			return myLoans.get(index);
		}
		return null;
	}
}
