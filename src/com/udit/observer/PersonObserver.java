package com.udit.observer;

public class PersonObserver implements Observer<PersonAgeChangeEvent> {

	private String id;

	public PersonObserver(String id) {
		this.id = id;
	}

	public void receive(PersonAgeChangeEvent e) {
		System.out.println("Observer ID : " + id + " - " + e);
	}
}
