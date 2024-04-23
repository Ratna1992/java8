package com.ratna.play.methodreference;



import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {

		// static method reference
		Function<String, Integer> func = Integer::parseInt;
		System.out.println(func.apply("25"));

		// method reference to instance method of an arbitrary type
		Function<String, String> func1 = String::toUpperCase;
		System.out.println(func1.apply("ratna"));

		// method reference to constructor
		Greetings greetings = GreetingsImpl::new;
		greetings.msg("Hello");

	}

}
