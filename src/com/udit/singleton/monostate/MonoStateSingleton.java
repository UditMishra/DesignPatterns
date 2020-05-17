package com.udit.singleton.monostate;

/**
 * New instances has no effect as data is stored statically, hence this is
 * effectively Singleton, but a very dangerous one. It is not recommended to
 * use.
 * 
 * @author udmishra
 *
 */
public class MonoStateSingleton {

	private static int val;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		MonoStateSingleton.val = val;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "State : " + val;
	}
}
