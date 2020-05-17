package com.udit.visitor;

public class DoubleExpression implements Expression {

	private int value;

	public DoubleExpression(int value) {
		this.value = value;
	}

	@Override
	public void accept(ExpressionVisitor visitor) {
		visitor.visit(this);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
