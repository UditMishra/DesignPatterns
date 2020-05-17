package com.udit.observer;

public class PersonAgeChangeEvent {

	private String propertyName;
	private int oldValue;
	private int newValue;

	public PersonAgeChangeEvent(String propertyName, int oldValue, int newValue) {
		this.propertyName = propertyName;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public int getOldValue() {
		return oldValue;
	}

	public int getNewValue() {
		return newValue;
	}

	@Override
	public String toString() {
		return "PersonAgeChangeEvent [propertyName=" + propertyName + ", oldValue=" + oldValue + ", newValue="
				+ newValue + "]";
	}

}
