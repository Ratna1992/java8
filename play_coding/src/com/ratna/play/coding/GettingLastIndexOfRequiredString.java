package com.ratna.play.coding;

import java.util.stream.Stream;

public class GettingLastIndexOfRequiredString {

	public static void main(String[] args) {
		String str = "welcome to world of srinivas where his world is his family";

		System.out.println(Stream.of(str).map(s -> s.lastIndexOf("world")).findFirst().get());

	}

}
