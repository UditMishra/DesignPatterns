package com.udit.adapter;

/**
 * Adapter class which will internally delegate the method
 * 
 * @author udmishra
 *
 */
public class IndexableAdapter implements Indexable {

	/**
	 * Adaptee
	 */
	private Persistable p;

	public IndexableAdapter(Persistable p) {
		this.p = p;
	}

	@Override
	public void index(Object document) {
		p.persist(document);
	}

}
