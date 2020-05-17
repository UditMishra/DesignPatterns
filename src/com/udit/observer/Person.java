package com.udit.observer;

import java.util.ArrayList;
import java.util.List;

public class Person implements Observable<PersonAgeChangeEvent> {

	private List<Observer<PersonAgeChangeEvent>> observers = new ArrayList<>();

	public Person(int age) {
		this.age = age;
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		int oldAge = this.age;
		this.age = age;
		PersonAgeChangeEvent event = new PersonAgeChangeEvent("age", oldAge, this.age);
		dispatch(event);
	}

	@Override
	public void addObserver(Observer<PersonAgeChangeEvent> observer) {
		observers.add(observer);
	}

	@Override
	public void dispatch(PersonAgeChangeEvent event) {
		observers.forEach(o -> o.receive(event));
	}

}
