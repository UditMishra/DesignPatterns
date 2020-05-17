package com.udit.nullobject;

public class TestNullObject {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(getLog(), 1000);

		System.out.println(account);

		account.deposit(100);
		System.out.println(account);

		account.withdraw(300);
		System.out.println(account);

		account.deposit(400);
		System.out.println(account);

		account.withdraw(2000);
		System.out.println(account);
	}

	/**
	 * Under normal circumstances, this method returns ConsoleLogger.
	 * But it relies on a LogProvider, which might return null.
	 * 
	 * In that case, we can supply a NullLog to avoid NPE and to continue the execution
	 * 
	 * @return
	 */
	private static Log getLog() {

		Log log = LogProvider.getLog();
		if (log == null) {
			log = new NullLog();
		}
		return log;
	}
}
