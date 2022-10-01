package com.ratna.play.coding;

import java.util.Arrays;
import java.util.List;

public class EvenNumberFrmList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(3, 6, 4, 2, 1);

		asList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
