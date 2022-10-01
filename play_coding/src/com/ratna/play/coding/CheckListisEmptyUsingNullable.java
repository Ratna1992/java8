package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CheckListisEmptyUsingNullable {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("33", null, "4", "2", "1", "23");
		//asList = null;
		Optional.ofNullable(asList).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull)
				.forEach(System.out::println);
		Optional<List<String>> ofNullable = Optional.ofNullable(asList);
		ofNullable.ifPresent(System.out::println);

	}

}
