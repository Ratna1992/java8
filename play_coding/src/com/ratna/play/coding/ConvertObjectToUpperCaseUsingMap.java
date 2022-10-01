package com.ratna.play.coding;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertObjectToUpperCaseUsingMap {

	public static void main(String[] args) {

		Stream<String> of = Stream.of("abc", "def", "ghj");
		List<String> collect = of.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);

	}

}
