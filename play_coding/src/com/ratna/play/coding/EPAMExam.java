package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EPAMExam {

	public static boolean validate(int[] a) {

		List<Integer> collect = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		if (collect.isEmpty() || collect.size() < 2) {
			return false;
		} else {
			boolean flag = false;

			for (int i = 0; i < collect.size(); i++) {

				if (collect.get(i) - collect.get(i + 1) == 1) {
					flag = true;
					break;
				}
			}
			return flag;
		}
	}

	public static void main(String[] args) {

		System.out.println(validate(new int[] { 6, 4, 3, 2, 1 }));

	}

}
