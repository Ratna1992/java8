package com.ratna.play.coding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CapitalizeFirstCharacterOfString {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("ratna", "ravi", "ramu", "siva");
		stream.map(elm -> {
			elm = elm.substring(0, 1).toUpperCase() + elm.substring(1);
			return elm;
		}).collect(Collectors.toList()).forEach(System.out::println);
		;

	}

}
