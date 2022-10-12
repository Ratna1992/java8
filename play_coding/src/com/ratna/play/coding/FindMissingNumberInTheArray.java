package com.ratna.play.coding;

import java.util.Arrays;

public class FindMissingNumberInTheArray {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 31, 32 };

		normalApproach(numbers);
		java8Approach(numbers);
	}

	private static void java8Approach(int[] numbers) {

		int maxNumber = Arrays.stream(numbers).max().getAsInt();
		int sum = Arrays.stream(numbers).sum();
		int reqSum = (maxNumber * (maxNumber + 1)) / 2;
		System.out.println(reqSum - sum);

	}

	private static void normalApproach(int[] numbers) {
		int N = numbers.length + 1;
		int idealSum = (N * (N + 1)) / 2;
		int sum = calculateSum(numbers);

		int missingNumber = idealSum - sum;
		System.out.println(missingNumber);
	}

	private static int calculateSum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}

}
