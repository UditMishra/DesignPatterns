package com.udit.strategy;

public class MarkDownListStrategy implements ListStrategy {

	@Override
	public void start(StringBuffer sb) {
	}

	@Override
	public void addListItem(String item, StringBuffer sb) {
		sb.append("*  " + item + System.lineSeparator());
	}

	@Override
	public void end(StringBuffer sb) {
	}
}
