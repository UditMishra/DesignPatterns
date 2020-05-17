package com.udit.strategy.dynamic;

import java.util.Arrays;
import java.util.List;

import com.udit.strategy.OutputFormat;

public class TestDynamicStrategy {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Udit", "Amit", "Anish");
		
		TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
		
		tp.appendList(names);
		System.out.println(tp);
		
		tp.clear();
		tp.setOutputFormat(OutputFormat.HTML);

		tp.appendList(names);
		System.out.println(tp);
		
	}
}
