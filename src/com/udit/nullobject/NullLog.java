package com.udit.nullobject;

/**
 * Null Object implementation of Log.
 * Basically a do-nothing class.
 * 
 * @author udmishra
 *
 */
public class NullLog implements Log {

	@Override
	public void info(String msg) {
	}

	@Override
	public void error(String msg) {
	}

}
