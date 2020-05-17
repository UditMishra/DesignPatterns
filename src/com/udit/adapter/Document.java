package com.udit.adapter;

/**
 * Concrete implementation of the target interface
 * 
 * @author udmishra
 *
 */
public class Document implements Indexable {

	@Override
	public void index(Object document) {
		System.out.println("Indexing the document");
	}

}
