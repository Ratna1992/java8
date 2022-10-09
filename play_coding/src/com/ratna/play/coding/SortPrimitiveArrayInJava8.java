package com.ratna.play.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortPrimitiveArrayInJava8 {

	public static void main(String[] args) {

		int arr[] = new int[] { 9, 8, 7, 1, 2, 3, 22 };

		// 1st approach
		IntStream.of(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);
		IntStream.of(arr).boxed().sorted().forEach(System.out::println);

		// 2nd approach
		Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		int intArr[] = { 9, 8, 7, 1, 2, 3, 22 };
		List<Integer> collect =(ArrayList<Integer>) Arrays.stream(intArr).boxed().collect(Collectors.toList());

	}

}
