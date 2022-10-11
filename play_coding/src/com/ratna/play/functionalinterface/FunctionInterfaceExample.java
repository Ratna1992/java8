package com.ratna.play.functionalinterface;

import java.util.function.Function;

public class FunctionInterfaceExample {

	public static void main(String[] args) {

		Function<String, Integer> function = a -> Integer.parseInt(a);

		Integer apply = function.apply("10");

		System.out.println(apply);

		RatnaFunction rFunction = a -> Integer.parseInt((String) a);
		Integer apply1 = (Integer) rFunction.perform((String) "10");

		System.out.println(apply1);

	}

}
