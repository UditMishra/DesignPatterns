package com.udit.observer;

public class TestObserver {

	public static void main(String[] args) {

		Person p = new Person(28);
		
		p.addObserver(new PersonObserver("P1"));
		p.addObserver(new PersonObserver("P2"));
		
		for (int i = 29; i < 34; i++) {
			p.setAge(i);
		}

	}
}
