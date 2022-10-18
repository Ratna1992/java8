package com.ratna.play.coding;

public class NthLargestNumberWithSorting {

	public static void main(String[] args) {

		int array[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85, 100 };
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		// Loop over the array
		for (int i = 0; i < array.length; i++) {
			// If current element is greater than highest
			if (array[i] > highest) {

				// assign second highest element to highest element
				secondHighest = highest;

				// highest element to current element
				highest = array[i];
			} else if (array[i] > secondHighest && array[i] != highest)
				// Just replace the second highest
				secondHighest = array[i];
		}

		// After exiting the loop, secondHighest now represents the second
		// largest value in the array
		System.out.println(secondHighest);
	}

}
