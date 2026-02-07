package com.functionalinterface.CloningPrototype;

public class RobotPrototype implements Cloneable {
	String model;

	RobotPrototype(String model) {
		this.model = model;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
