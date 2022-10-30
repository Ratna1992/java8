package com.ratna.play.collections;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToCollection {

	public static void main(String[] args) {

		// creating a sample array
		String sample_array[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		List<String> list = Arrays.asList(sample_array);

		list.forEach(System.out::println);
	}

}
