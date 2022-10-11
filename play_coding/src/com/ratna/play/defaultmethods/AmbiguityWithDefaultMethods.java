package com.ratna.play.defaultmethods;

public class AmbiguityWithDefaultMethods implements Paint, Shape {

	public String circlePaint() {
		return Paint.super.circle();
	}

	public String circleShape() {
		return Shape.super.circle();
	}

	@Override
	public String circle() {
		return Shape.super.circle() + " " + Paint.super.circle();
	}

	public static void main(String[] args) {
		AmbiguityWithDefaultMethods ambiguityWithDefaultMethods = new AmbiguityWithDefaultMethods();

		// using Paint circle method
		System.out.println(ambiguityWithDefaultMethods.circlePaint());

		// using Shape circle method
		System.out.println(ambiguityWithDefaultMethods.circleShape());

		// using both methods
		System.out.println(ambiguityWithDefaultMethods.circle());
	}
}
