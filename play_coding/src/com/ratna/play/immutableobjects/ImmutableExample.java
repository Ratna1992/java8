package com.ratna.play.immutableobjects;

//final class
public final class ImmutableExample {

	// final variable
	private final String rollNo;

	// only create a getter method.
	public String getRollNo() {
		return rollNo;
	}

	public ImmutableExample(String rollNo) {
		this.rollNo = rollNo;
	}

}
