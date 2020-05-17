package com.udit.chainofresp;

/**
 * Chain of Responsibility consists of a source of command object and series of Processing object.
 * It 
 * 	Decoupling a sender and receiver of a command
 * 	Picking a processing strategy at processing-time
 * 
 * @author udmishra
 *
 */
public abstract class NumberProcessor {

	protected int number;
	private NumberProcessor next;

	public NumberProcessor(int number) {
		this.number = number;
	}
	
	/**
	 * add next Processor
	 * @param processor
	 */

	public void addProcessor(NumberProcessor processor) {
		if (next != null) {
			next.addProcessor(processor);
		}
		else {
			next = processor;
		}
	}

	/**
	 * delegate to the next in the chain
	 */
	public void process() {
		if (next != null) {
			next.process();
		}
	}

}
