package com.dayfive.LoanBuddy;

abstract class LoanApplication implements IApprovable {
	protected String type;

	protected double interestRate;
	protected double loanAmount;

	protected int term;
	protected int monthsPaid = 0;

	protected boolean isApproved;

	public LoanApplication(double amount, int term, double interestRate) {
		this.interestRate = interestRate;
		this.loanAmount = amount;
		this.term = term;
		this.isApproved = false;
	}

	public void payInstallment() {
		if (!isApproved) {
			System.out.println("Loan not approved");
			return;
		}

		if (monthsPaid == term) {
			System.out.println("Loan fully paid");
			return;
		}

		monthsPaid++;
		double emi = calculateEMI();
		int remaining = term - monthsPaid;

		System.out.printf("EMI of %.2f paid successfully%n",emi);

		if (remaining == 0) {
			System.out.println("Loan fully paid");
		}
	}
	
	public boolean isPaid() {
		return monthsPaid == term;
	}

	@Override
	public boolean approveLoan(Applicant applicant) {
		if (applicant.getCreditScore() > 700) {
			this.isApproved = true;
			return true;
		} else {
			this.isApproved = false;
			return false;
		}
	}

	@Override
	public double calculateEMI() {
		if (loanAmount == 0 || term == 0) {
			return 0;
		}

		double R = (interestRate / 12) / 100;
		return (loanAmount * R * Math.pow(1 + R, term)) / (Math.pow(1 + R, term) - 1);
	}
}