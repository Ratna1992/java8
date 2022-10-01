package com.ratna.play.coding;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingCharacterInstring {

	public static void main(String[] args) {

		String input = "Ratna Srinivasa rao  Karicherla is a king";

		Character character = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // getting
																												// value
																												// of
																												// character
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // converting
																												// to
																												// map
				.entrySet().stream().filter(entry -> entry.getValue() > 1l).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(character);

	}

}
