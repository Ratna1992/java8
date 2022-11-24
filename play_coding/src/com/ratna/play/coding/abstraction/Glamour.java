package com.ratna.play.coding.abstraction;

public class Glamour extends Bike {

	public Glamour(String milege) {
		super(milege);
		System.out.println(milege);

	}

	@Override
	public void run() {

		System.out.println("Glamour runs...");

	}

}
