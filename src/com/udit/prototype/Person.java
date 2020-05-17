package com.udit.prototype;

import java.util.Arrays;

public class Person implements Cloneable {

	private String[] names;
	private Address address;

	public Person(String[] names, Address address) {
		this.names = names;
		this.address = address;
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Person(names.clone(), (Address) address.clone());
	}
}