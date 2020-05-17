package com.udit.visitor;

public interface ExpressionVisitor {

	public void visit(DoubleExpression de);
	
	public void visit(AdditionExpression ae);
}
