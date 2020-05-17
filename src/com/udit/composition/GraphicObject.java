package com.udit.composition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Component allows to use same API in a uniform manner for scalar
 * as well as composite objects.
 * 
 * @author udmishra
 *
 */
public class GraphicObject {

	protected String name;
	protected String color;

	private List<GraphicObject> children = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<GraphicObject> getChildren() {
		return children;
	}

	public void setChildren(List<GraphicObject> children) {
		this.children = children;
	}

	public void draw() {
		showDetails(this, 0);
	}

	private void showDetails(GraphicObject obj, int level) {

		String prefix = String.join("", Collections.nCopies(level, "*"));
		String color = getColor() == null ? "" : " " + getColor() + " ";
		System.out.println(prefix + color + getName());
		for (GraphicObject children : obj.getChildren()) {
			children.showDetails(children, level + 1);
		}
	}
}
