package com.udit.factory;

import java.util.HashMap;
import java.util.Map;

public class LoanFactory {

	private static Map<LoanType, Loan> loans = new HashMap<>();

	static {
		loans.put(LoanType.HOME, new HomeLoan());
		loans.put(LoanType.CAR, new CarLoan());
	}

	private LoanFactory() {
	}

	public static Loan getLoan(LoanType loanType) {
		return loans.get(loanType);
	}
}
