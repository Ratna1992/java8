package com.ratna.play.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

	public static void main(String[] args) {

		Predicate<String> predicate = name -> name.equalsIgnoreCase("KING");
		boolean test = predicate.test("king");
		boolean test2 = predicate.test("queen");
		System.out.println(test + " " + test2);
	}

}
