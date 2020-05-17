package com.udit.visitor;

public interface Expression {

	public void accept(ExpressionVisitor visitor);
}
