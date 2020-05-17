package com.udit.iterator;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

	private int start;
	private int end;

	private int current;

	public Range(int start, int end) {
		this.start = start;
		this.end = end;
		this.current = this.start;
	}

	Iterator<Integer> itr = new Iterator<Integer>() {

		@Override
		public Integer next() {
			return current++;
		}

		@Override
		public boolean hasNext() {
			return current <= end;
		}
	};

	@Override
	public Iterator<Integer> iterator() {
		return this.itr;
	}

}
