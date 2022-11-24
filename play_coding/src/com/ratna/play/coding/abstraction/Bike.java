package com.ratna.play.coding.abstraction;

public abstract class Bike {

	private String milege = "56KMPH";

	public abstract void run();

	public Bike(String milege) {
		super();
		this.milege = milege;
	}
	
	public void changeGear() {
		System.out.println("change gear");
	}

}
