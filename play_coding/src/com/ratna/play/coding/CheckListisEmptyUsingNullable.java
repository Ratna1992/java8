package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public class CheckListisEmptyUsingNullable {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("33", null, "4", "2", "1", "23");
		// asList = null;
		Optional.ofNullable(asList).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull)
				.forEach(System.out::println);
		Optional<List<String>> ofNullable = Optional.ofNullable(asList);
		ofNullable.ifPresent(System.out::println);

		String str = "null check";

		String string = Optional.of(str).get();
		System.out.println(string);

		String string1 = Optional.ofNullable(str).get();
		System.out.println(string1);

		str = null;

		try {
			Optional<String> string2 = Optional.of(str);
			System.out.println("Optional.of(str)" + string2);
			System.out.println(string2.get());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		try {
			Optional<String> string3 = Optional.ofNullable(str);
			System.out.println("Optional.ofNullable(str)" + string3);
			System.out.println(string3.get());
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}

	}

}
