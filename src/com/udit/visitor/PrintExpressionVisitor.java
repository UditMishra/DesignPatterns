package com.udit.visitor;

public class PrintExpressionVisitor implements ExpressionVisitor {

	@Override
	public void visit(DoubleExpression de) {
		System.out.print(de.getValue());
	}

	@Override
	public void visit(AdditionExpression ae) {
		System.out.print("(");
		ae.getLeft().accept(this);
		System.out.print("+");
		ae.getRight().accept(this);
		System.out.print(")");
	}

}
