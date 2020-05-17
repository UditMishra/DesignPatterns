package com.udit.command;

import java.util.Arrays;
import java.util.List;

import com.udit.command.BankAccountCommand.Action;

public class TestBankAccount {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(5000);

		List<Command> commands = Arrays.asList(new BankAccountCommand(account, Action.DEPOSIT, 1000),
				new BankAccountCommand(account, Action.WITHDRAW, 3000),
				new BankAccountCommand(account, Action.DEPOSIT, 2000),
				new BankAccountCommand(account, Action.WITHDRAW, 2000),
				new BankAccountCommand(account, Action.DEPOSIT, 1000));

		commands.forEach(command -> {
			command.execute();
			System.out.println(account);
		});

	}
}
