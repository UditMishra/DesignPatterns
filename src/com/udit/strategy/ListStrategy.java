package com.udit.strategy;

public interface ListStrategy {

	void start(StringBuffer sb);

	void addListItem(String item, StringBuffer sb);

	void end(StringBuffer sb);
}
