package com.udit.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Interpreter design pattern specifies how to evaluate sentences in a language.
 * 
 * 		1. Define a grammar for a simple language by defining an Expression class hierarchy and implementing an interpret() operation. 
 * 
 * 		2. Represent a sentence in the language by an abstract syntax tree (AST) made up of Expression instances. 
 * 
 * 		3. Interpret a sentence by calling interpret() on the AST.
 * 
 * @author udmishra
 *
 */
public class TestInterpreter {

	public static void main(String[] args) {

		String expression = "w x y - +";

		Expr expr = Parser.parse(expression);
		int result = expr.interpret(getValueMap());

		System.out.println("Result : " + result);

	}

	private static Map<String, Integer> getValueMap() {

		Map<String, Integer> valueMap = new HashMap<>();

		valueMap.put("w", 5);
		valueMap.put("x", 10);
		valueMap.put("y", 42);

		return valueMap;
	}
}
