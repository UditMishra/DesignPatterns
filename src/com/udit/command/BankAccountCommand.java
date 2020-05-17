package com.udit.command;

/**
 * Command object represents instruction to perform an action. It also contains
 * all the necessary information for an Action
 * 
 * @author udmishra
 *
 */
public class BankAccountCommand implements Command {

	private BankAccount account;
	private int amount;
	private Action action;

	public enum Action {
		DEPOSIT, WITHDRAW
	}

	public BankAccountCommand(BankAccount account, Action action, int amount) {
		this.account = account;
		this.action = action;
		this.amount = amount;
	}

	@Override
	public void execute() {

		switch (action) {
			case DEPOSIT:
				account.deposit(amount);
				break;
			case WITHDRAW:
				account.withdraw(amount);
				break;
		}
	}

}
