package com.udit.iterator;

import java.util.Iterator;

public class TestRange {

	public static void main(String[] args) {

		Range range1 = new Range(10, 20);

		Iterator<Integer> itr1 = range1.iterator();

		System.out.print("Range 1 : [");
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + ", ");
		}
		System.out.println("]\n\nRange 2 : \n");

		Range range2 = new Range(5, 10);
		Iterator<Integer> itr2 = range2.iterator();

		itr2.forEachRemaining(System.out::println);

	}
}
