package com.dayfive.LoanBuddy;

public class Main {

	public static void main(String[] args) {
		Applicant user = new Applicant("Aneek", 720);
		
        user.applyForLoan(new AutoLoan(50000, 2));
        user.applyForLoan(new AutoLoan(3000000, 18));
        user.applyForLoan(new HomeLoan(10000000, 60));

        LoanApplication loan = user.getLoan(0);
        
        loan.payInstallment();
        loan.payInstallment();

        user.closeLoan(1);
        user.closeLoan(0);


        user.applyForLoan(new HomeLoan(4000000, 60));
	}

}
