package com.udit.builder;

public class TestBuilder {

	public static void main(String[] args) {

		Person p = new Person.PersonBuilder("Udit").withAge(29).phone("9819239199").city("Banka").build();

		System.out.println(p);
	}
}
