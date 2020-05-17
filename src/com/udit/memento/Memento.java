package com.udit.memento;

/**
 * A Memento class holding a snapshot of BankAccount
 * 
 * @author udmishra
 *
 */
public class Memento {

	private int value;

	public Memento(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
