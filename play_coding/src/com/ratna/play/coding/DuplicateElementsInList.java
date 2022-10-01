package com.ratna.play.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsInList {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(13, 13, 22, 2, 26, 18, 2, 1, 22, 14);
		Set<Integer> set = new HashSet<>();
		asList.stream().filter(n -> !set.add(n)).forEach(System.out::println);

	}

}
