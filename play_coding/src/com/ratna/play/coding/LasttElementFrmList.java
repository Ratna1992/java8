package com.ratna.play.coding;

import java.util.Arrays;
import java.util.List;

public class LasttElementFrmList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(3, 6, 4, 2, 1, 23);

		// first approach
		asList.stream().reduce((first, second) -> second).ifPresent(System.out::println);

		// second approach
		long count = asList.stream().count();
		asList.stream().skip(count - 1).findFirst().ifPresent(System.out::println);

		// third approach
		asList.stream().skip(asList.size() - 1).findFirst().ifPresent(System.out::println);

	}

}
