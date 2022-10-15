package com.ratna.play.polymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) {

		// upcasting
		// dynamic method dispatching
		Vehicle bike = new Bike();
		bike.run();
		System.out.println(bike.display());
		System.out.println(bike.milege());
	}
}
