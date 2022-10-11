package com.ratna.play.functionalinterface;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {

		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("I wont return your investment");
	}
}
