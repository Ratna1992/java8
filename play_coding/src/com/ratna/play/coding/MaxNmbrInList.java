package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNmbrInList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(3, 6, 4, 2, 1, 23);

		System.out.println(asList.stream().max(Comparator.naturalOrder()).get());

	}

}
