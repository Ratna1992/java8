package com.ratna.play.immutableobjects;

public class ImmutableTesting {

	public static void main(String[] args) {

		MutableObject m = new MutableObject();
		m.setName("I am mutable");

		ImmutableExample immutableExample = new ImmutableExample("1", m);
		System.out.println(immutableExample.getObject().getName());

		m.setName("Your immutable object will break now !!!");
		System.out.println(immutableExample.getObject().getName());

		immutableExample.getObject().setName("Your immutable object will break now also even though you took care !!!");
		System.out.println(immutableExample.getObject().getName());

	}

}
