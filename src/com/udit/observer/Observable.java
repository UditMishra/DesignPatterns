package com.udit.observer;

public interface Observable<T> {

	public void addObserver(Observer<T> observer);

	public void dispatch(T event);
}
