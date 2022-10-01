package com.ratna.play.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxByMinByMethodExample {

	public static void main(String[] args) {
		{
			List<String> stringList = Arrays.asList("educative", "co", "adpresso");

			Optional<String> maxElement = stringList.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));

			System.out.println(maxElement.get());

			Optional<String> maxElement1 = stringList.stream().collect(Collectors.maxBy(Comparator.reverseOrder()));

			System.out.println(maxElement1.get());

			Optional<String> minElement = stringList.stream().collect(Collectors.minBy(Comparator.naturalOrder()));

			System.out.println(minElement.get());

			Optional<String> minElement1 = stringList.stream().collect(Collectors.minBy(Comparator.reverseOrder()));

			System.out.println(minElement1.get());
		}

	}

}
