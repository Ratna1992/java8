package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GEInterview {

	static int count = 0;
	static String str1 = "";

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Ratna", "rao", "sam", "ram", "raja");
		asList.stream().filter(s -> s.length() > 3).collect(Collectors.toList()).forEach(System.out::println);

		String str = "ac2be3w";
		str.chars().mapToObj(s -> (char) s).collect(Collectors.toList()).stream().sorted(Comparator.naturalOrder())
				.forEach(s -> {
					try {
						if ((Integer) Integer.parseInt(s.toString()) != null) {
							count = count + Integer.parseInt(s.toString());
						}
					} catch (Exception e) {
						str1 = str1 + s;
					}
				});
		System.out.println(str1 + count);
	}

}
