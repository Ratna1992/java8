package com.ratna.play.coding.inheritence;

public class Animal {

	// animal has owner (aggregation
	private Owner owner;

	public void sound() {
		System.out.println("animal ..." + owner);
	}

}
