package com.ratna.play.coding;

import java.util.Arrays;
import java.util.List;

public class NmbrsStartingWithOne {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(13, 26, 18, 2, 1, 22, 14);

		asList.stream().map(n -> n + "").filter(n -> n.startsWith("1")).forEach(System.out::println);

	}

}
