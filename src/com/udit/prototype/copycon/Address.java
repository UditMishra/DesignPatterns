package com.udit.prototype.copycon;

public class Address {

	private String streetName;
	private int houseNo;

	public Address(String streetName, int houseNo) {
		this.streetName = streetName;
		this.houseNo = houseNo;
	}

	public Address(Address other) {
		this.streetName = other.streetName;
		this.houseNo = other.houseNo;
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
}
