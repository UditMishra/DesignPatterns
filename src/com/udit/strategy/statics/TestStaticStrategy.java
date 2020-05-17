package com.udit.strategy.statics;

import java.util.Arrays;
import java.util.List;

import com.udit.strategy.HTMLListStrategy;
import com.udit.strategy.MarkDownListStrategy;

public class TestStaticStrategy {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Udit", "Amit", "Anish");

		TextProcessor<MarkDownListStrategy> tp1 = new TextProcessor<>(() -> new MarkDownListStrategy());
		tp1.appendList(names);
		System.out.println(tp1);

		TextProcessor<HTMLListStrategy> tp2 = new TextProcessor<>(HTMLListStrategy::new);
		tp2.appendList(names);
		System.out.println(tp2);

	}
}
