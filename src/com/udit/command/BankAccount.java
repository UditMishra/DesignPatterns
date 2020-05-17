package com.udit.command;

public class BankAccount {

	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println("Deposited " + amount + ", Balance : " + balance);
	}

	public void withdraw(int amount) {
		if ((balance - amount) >= 0) {
			balance -= amount;
			System.out.println("Withdrew " + amount + ", Balance : " + balance);
		} else {
			System.out.println("Could not withdrew due to insufficient balance");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BankAccount {" + balance + "}";
	}
}
