package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ratna.play.model.Gender;

public class FlatMapMethodExample {

	public static void main(String[] args) {
		List<List<String>> languageNames = Arrays.asList(Arrays.asList("Javascript", "HTML", "CSS"),
				Arrays.asList("Simula", "Java", "Python", "Ruby"));
		List<String> collect = languageNames.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(collect);

		Map<String, List<String>> languageNamesMap = new HashMap<>();
		languageNamesMap.put("frontend", Arrays.asList("Javascript", "HTML", "CSS"));
		languageNamesMap.put("backend", Arrays.asList("Simula", "Java", "Python", "Ruby"));
		languageNamesMap.values().stream().flatMap(Collection::stream).collect(Collectors.toList());

		Map<Integer, Map<Gender, List<String>>> allStudentsGorupedByAgeAndThenGender = new HashMap<>();
		HashMap<Gender, List<String>> studentsGroupedByGender = new HashMap<>();
		studentsGroupedByGender.put(Gender.male, Arrays.asList("Christian", "Barack", "Andrew"));
		studentsGroupedByGender.put(Gender.female, Arrays.asList("Andre", "Lorina", "Rakhi"));
		allStudentsGorupedByAgeAndThenGender.put(16, studentsGroupedByGender);

		// i want to get all the student names
		List<String> allLanguages = allStudentsGorupedByAgeAndThenGender.values().stream()
				.flatMap(each -> each.values().stream()).flatMap(each -> each.stream()).collect(Collectors.toList());
		allLanguages.forEach(System.out::println);

		int[] integers = { 3, 2, 4, 10, 18 };

		Stream<int[]> streamOfIntArray = Stream.of(integers);

		int sum = streamOfIntArray.flatMapToInt(Arrays::stream).sum();

		System.out.println(sum);
	}

}
