package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class SortPrimitiveArrayInJava8 {

	public static void main(String[] args) {

		int arr[] = new int[] { 9, 8, 7, 1, 2, 3, 22 };

		// 1st approach
		IntStream.of(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);
		IntStream.of(arr).boxed().sorted().forEach(System.out::println);

		// 2nd approach
		Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
