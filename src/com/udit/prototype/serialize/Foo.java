package com.udit.prototype.serialize;

import java.io.Serializable;
import java.util.Arrays;

public class Foo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int val;
	private String[] data;

	public Foo(int val, String[] data) {
		super();
		this.val = val;
		this.data = data;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Foo [val=" + val + ", data=[" + Arrays.toString(data) + "]]";
	}

}
