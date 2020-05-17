package com.udit.nullobject;

public class BankAccount {

	private int balance;
	/**
	 * Here, we have a dependency on Log object
	 */
	private Log log;

	public BankAccount(Log log, int amount) {
		this.balance = amount;
		this.log = log;
	}

	public void deposit(int amount) {
		balance += amount;
		log.info("Deposited : " + amount + ", Balance : " + balance);
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			log.error("Tried to withdraw " + amount + ", Insufficient Balance");
			return;
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Account { Balance : " + balance + "}";
	}
}
