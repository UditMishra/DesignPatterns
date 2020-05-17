package com.udit.prototype;

public class Address implements Cloneable {

	private String streetName;
	private int houseNo;

	public Address(String streetName, int houseNo) {
		this.streetName = streetName;
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Address : [streetName=" + streetName + ", houseNo=" + houseNo + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Address(streetName, houseNo);
	}
}
