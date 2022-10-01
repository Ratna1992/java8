package com.ratna.play.coding;

import java.util.Arrays;
import java.util.List;

public class TotalNmbrOfElementsInList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(33, 6, 4, 2, 1, 23);

		System.out.println(asList.stream().count());
		System.out.println(asList.size());

	}

}
