package com.udit.memento;

/**
 * A BankAccount class
 * 
 * @author udmishra
 *
 */
public class BankAccount {

	private int balance;
	
	public BankAccount(int amount) {
		this.balance = amount;
	}

	public Memento deposit(int amount) {
		balance += amount;
		return new Memento(balance);
	}

	public void restore(Memento m) {
		this.balance = m.getValue();
	}

	@Override
	public String toString() {
		return "Account { Balance : " + balance + "}";
	}
}
