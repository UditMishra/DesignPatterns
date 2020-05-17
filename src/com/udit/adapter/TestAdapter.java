package com.udit.adapter;

public class TestAdapter {
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		/**
		 * Existing functionality
		 */
		Persistable p = new DatabaseRecord();
		p.persist(obj);
		
		/**
		 * New Feature
		 */
		Indexable d = new Document();
		d.index(obj);
		
		/**
		 * Now, client wants to use the target interface (Indexable).
		 * But, the passed object (DatabaseRecord) is not compatible.
		 * 
		 * Hence, we can not write => Indexable d = new DatabaseRecord();
		 * 
		 * So, we can use an adapter in between which will support the target interface,
		 * but is able to reuse the source interface.
		 * Thus, an Adapter facilitates different incompatible interfaces to work together.
		 */
		
		Indexable id = new IndexableAdapter(p);
		id.index(obj);

	}

}
