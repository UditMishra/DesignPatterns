package com.udit.interpreter;

import java.util.Stack;

public class Parser {

	public static Expr parse(String expr) {
	
		Stack<Expr> stack = new Stack<>();
		
		for (String token : expr.split(" ")) {
			stack.push(parseToken(token, stack));
		}
		
		return stack.pop();
	}

	private static Expr parseToken(String token, Stack<Expr> stack) {
		
		Expr right, left;
		switch (token) {
			case "+":
				right = stack.pop();
				left = stack.pop();
				return Expr.plus(left, right);
			case "-":
				right = stack.pop();
				left = stack.pop();
				return Expr.minus(left, right);
			default:
				return Expr.variable(token);
		}
	}
}
