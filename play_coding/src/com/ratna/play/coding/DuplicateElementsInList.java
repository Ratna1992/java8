package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsInList {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(13, 13, 22, 2, 26, 18, 2, 1, 22, 14);

		// solution 1
		Set<Integer> set = new HashSet<>();
		asList.stream().filter(n -> !set.add(n)).forEach(System.out::println);

		// solution 2
		Map<Integer, Long> collect = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		collect.entrySet().stream().forEach(entry -> {
			if (entry.getValue().intValue() > 1) {
				System.out.println(entry.getKey());
			}
		});
		// solution 3
		Map<Integer, Long> collect2 = asList.stream().filter(elm -> Collections.frequency(asList, elm) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect2);

	}

}
