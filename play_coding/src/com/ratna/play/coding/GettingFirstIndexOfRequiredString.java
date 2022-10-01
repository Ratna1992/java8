package com.ratna.play.coding;

import java.util.stream.Stream;

public class GettingFirstIndexOfRequiredString {

	public static void main(String[] args) {
		String str = "welcome to world of srinivas";

		System.out.println(Stream.of(str).map(s -> s.indexOf("world")).findFirst().get());

	}

}
