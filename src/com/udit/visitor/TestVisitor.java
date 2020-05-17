package com.udit.visitor;

public class TestVisitor {

	public static void main(String[] args) {

		Expression a = new DoubleExpression(5);
		Expression b = new AdditionExpression(new DoubleExpression(7), new DoubleExpression(8));

		Expression c = new AdditionExpression(a, b);

		ExpressionVisitor visitor = new PrintExpressionVisitor();
		c.accept(visitor);

	}
}
