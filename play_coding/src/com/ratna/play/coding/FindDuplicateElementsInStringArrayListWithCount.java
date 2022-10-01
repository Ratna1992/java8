package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementsInStringArrayListWithCount {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("AA", "BB", "AA", "CC");
		// used to check if repeating more than 1
		Map<String, Long> collect = list.stream().filter(str -> Collections.frequency(list, str) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

	}

}
