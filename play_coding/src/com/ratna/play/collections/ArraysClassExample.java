package com.ratna.play.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysClassExample {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("a", "b", "c", "d");
		// asList.add("e");
		asList.set(1, "e");
		System.out.println(asList);
		String[] stringArray = new String[] { "A", "B", "C", "D" };
		List<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
		arrayList.add("E");
		arrayList.set(1, "F");
		System.out.println(arrayList);

	}

}
