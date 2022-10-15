package com.ratna.play.immutableobjects;

//final class
public final class ImmutableExample {

	// final variable
	private final String rollNo;

	// mutable object
	private MutableObject object;

	// only create a getter method.
	public MutableObject getObject() {
		// In getter methods, always perform cloning and return the clone copy instead
		// of actual object reference.
		MutableObject clone = new MutableObject();
		clone.setName(this.object.getName());
		return clone;
	}

	// only create a getter method.
	public String getRollNo() {
		return rollNo;
	}

	// public constructor
	public ImmutableExample(String rollNo, MutableObject object) {
		super();
		this.rollNo = rollNo;
		this.object = object;

		// Use deep copy instead of shallow copy, while initializing the properties by
		// constructor.
		MutableObject clone = new MutableObject();
		clone.setName(object.getName());
		this.object = clone;
	}

}
