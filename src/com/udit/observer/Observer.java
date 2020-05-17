package com.udit.observer;

public interface Observer<T> {

	public void receive(T event);
}
