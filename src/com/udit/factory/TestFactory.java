package com.udit.factory;

public class TestFactory {

	public static void main(String[] args) {
		
		int loanAmount = 100000;
		
		Loan homeLoan = LoanFactory.getLoan(LoanType.HOME);
		Loan carLoan = LoanFactory.getLoan(LoanType.CAR);
		
		System.out.println("Home Loan Interest : " + homeLoan.calculateInterest(loanAmount));
		System.out.println("Car Loan Interest : " + carLoan.calculateInterest(loanAmount));
	}
}
