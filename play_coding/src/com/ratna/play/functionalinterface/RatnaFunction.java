package com.ratna.play.functionalinterface;

@FunctionalInterface
public interface RatnaFunction {

	Object perform(Object object);

	public static String perfrom() {
		return "perfrom object operation";
	}

	@Override
	int hashCode();

	public default String display() {
		return "displayed";
	}
}
