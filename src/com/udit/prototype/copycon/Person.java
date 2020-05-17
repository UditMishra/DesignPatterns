package com.udit.prototype.copycon;

import java.util.Arrays;

public class Person {

	private String[] names;
	private Address address;

	public Person(String[] names, Address address) {
		this.names = names;
		this.address = address;
	}

	public Person(Person other) {
		this.names = new String[] { other.names[0], other.names[1] };
		this.address = new Address(other.address);
	}

	public String[] getNames() {
		return names;
	}

	public Address getAddress() {
		return address;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person : [names=" + Arrays.toString(names) + ", address=" + address + "]";
	}
}