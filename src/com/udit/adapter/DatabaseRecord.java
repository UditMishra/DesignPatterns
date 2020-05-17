package com.udit.adapter;

/**
 * Concrete implementation of the existing interface
 * 
 * @author udmishra
 *
 */
public class DatabaseRecord implements Persistable {

	@Override
	public void persist(Object record) {
		System.out.println("Persisting record in DB");
	}

}
