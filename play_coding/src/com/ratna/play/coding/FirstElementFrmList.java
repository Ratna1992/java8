package com.ratna.play.coding;

import java.util.Arrays;
import java.util.List;

public class FirstElementFrmList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(3, 6, 4, 2, 1);

		asList.stream().findFirst().ifPresent(System.out::println);

	}

}
