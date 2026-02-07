package com.lamdaexpressions.SmartHome;

@FunctionalInterface
public interface LightAction {
	void activate(String room);
}
