package com.udit.memento;

public class TestMemento {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(1000);
		System.out.println(account);

		Memento m1 = account.deposit(500); // 1500
		System.out.println(account);

		Memento m2 = account.deposit(300); // 1800
		System.out.println(account);

		/**
		 * Let's reset to first 1500
		 */

		account.restore(m1);
		System.out.println(account);

		/**
		 * Now, reset to 1800
		 */

		account.restore(m2);
		System.out.println(account);

	}
}
