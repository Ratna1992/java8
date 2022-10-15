package com.ratna.play.polymorphism;

public class Vehicle {
	public void run() {
		System.out.println("Vehicle is running");
	}

	// static methods cannot be overridden
	public static double cost() {
		return 2300000d;
	}

	// access specifiers must not be more restrictive
	public String display() {
		return "displayed";
	}

	// final methods cannot be overridden
	public final void yearOfManufacturing(long year) {
		System.out.println(year);
	}

	// private methods cannot be overridden
	private String notes() {
		return "Vehicle specific notes";
	}

	// co-variant return type non primitive only
	public Object milege() {
		return 23;
	}

	public void exceptionCheck() throws Exception {
		System.out.println("checked");
	}
}
