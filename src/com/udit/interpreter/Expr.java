package com.udit.interpreter;

import java.util.Map;

public interface Expr {

	int interpret(Map<String, Integer> valueMap);

	static Expr plus(Expr left, Expr right) {
		return valueMap -> left.interpret(valueMap) + right.interpret(valueMap);
	}

	static Expr minus(Expr left, Expr right) {
		return valueMap -> left.interpret(valueMap) - right.interpret(valueMap);
	}

	static Expr variable(String key) {
		return valueMap -> valueMap.getOrDefault(key, 0);
	}
}
