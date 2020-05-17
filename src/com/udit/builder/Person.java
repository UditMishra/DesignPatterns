package com.udit.builder;

public class Person {

	private String name;
	private int age;
	private String phoneNo;
	private String city;

	private Person(PersonBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.phoneNo = builder.phoneNo;
		this.city = builder.city;
	}

	public static class PersonBuilder {

		private String name;
		private int age;
		private String phoneNo;
		private String city;
		
		public PersonBuilder(String name) {
			this.name = name;
		}
		
		public PersonBuilder withAge(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder phone(String phoneNo) {
			this.phoneNo = phoneNo;
			return this;
		}
		
		public PersonBuilder city(String city) {
			this.city = city;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phoneNo=" + phoneNo + ", city=" + city + "]";
	}
}
