package com.udit.strategy.statics;

import java.util.List;
import java.util.function.Supplier;

import com.udit.strategy.ListStrategy;

public class TextProcessor<LS extends ListStrategy> {

	private StringBuffer sb;
	private LS strategy;

	public TextProcessor(Supplier<? extends LS> con) {
		this.sb = new StringBuffer();
		this.strategy = con.get();
	}

	public void appendList(List<String> items) {
		strategy.start(sb);
		items.forEach(item -> strategy.addListItem(item, sb));
		strategy.end(sb);
	}

	public void clear() {
		sb.setLength(0);
	}

	@Override
	public String toString() {
		return sb.toString();
	}
}
