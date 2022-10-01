package com.ratna.play.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachElemntOfStringArrayList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}

}
