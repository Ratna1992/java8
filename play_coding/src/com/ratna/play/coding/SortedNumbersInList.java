package com.ratna.play.coding;

import java.util.Arrays;
import java.util.List;

public class SortedNumbersInList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(3, 6, 4, 2, 1, 23);

		asList.stream().sorted().forEach(System.out::println);

	}

}
