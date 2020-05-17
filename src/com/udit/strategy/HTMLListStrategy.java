package com.udit.strategy;

public class HTMLListStrategy implements ListStrategy {

	@Override
	public void start(StringBuffer sb) {
		sb.append("<ul>");
	}

	@Override
	public void addListItem(String item, StringBuffer sb) {
		sb.append("<li>" + item + "</li>");
	}

	@Override
	public void end(StringBuffer sb) {
		sb.append("</ul>");
	}
}
