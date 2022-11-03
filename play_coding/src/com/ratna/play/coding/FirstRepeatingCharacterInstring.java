package com.ratna.play.coding;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstRepeatingCharacterInstring {

	public static void main(String[] args) {

		String input = "Ratna Srinivasa rao  Karicherla is a king";
		Stream<Character> mapToObj = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)));

		LinkedHashMap<Character, Long> collect = mapToObj
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Character character2 = collect.entrySet().stream().filter(e -> e.getValue() > 1l).map(entry -> entry.getKey())
				.findFirst().get();

		System.out.println(character2);
	}

}
