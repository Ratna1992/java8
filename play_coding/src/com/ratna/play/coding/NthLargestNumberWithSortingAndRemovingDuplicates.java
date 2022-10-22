package com.ratna.play.coding;

public class NthLargestNumberWithSortingAndRemovingDuplicates {

	public static void main(String[] args) {

		int arr[] = { 14, 46, 47, 86, 52, 48, 36, 66, 85, 85, 85, 86 };
		System.out.println("The given array is:");
		displayInitialArray(arr);
		System.out.println();
		System.out.println("The given array after sorting is:");
		int[] sortedArray = getSortedArray(arr);
		displayInitialArray(sortedArray);
		System.out.println();
		System.out.println("The given array after removing duplicates is:");
		int[] removeDuplicateElements = removeDuplicateElements(sortedArray);
		arr = removeDuplicateElements;
		displayInitialArray(removeDuplicateElements);

		System.out.println();
		System.out.println("The largest number in  array is: " + arr[arr.length - 1]);
		System.out.println("The Second largest number in  array is: " + arr[arr.length - 2]);
		System.out.println("The Third largest number in  array is: " + arr[arr.length - 3]);

		System.out.println("The smallest number in  array is: " + arr[arr.length - (arr.length)]);
		System.out.println("The second smallest number in  array is: " + arr[arr.length - (arr.length - 1)]);
		System.out.println("The third smallest number in  array is: " + arr[arr.length - (arr.length - 2)]);

	}

	private static void displayInitialArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	// sort an array
	private static int[] getSortedArray(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		return arr;
	}

	// remove duplicates from an array
	public static int[] removeDuplicateElements(int arr[]) {
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		// saving last element
		temp[j++] = arr[arr.length - 1];

		//restructuring array
		int arr1[] = new int[j];
		for (int i = 0; i < j; i++) {
			arr1[i] = temp[i];
		}
		return arr1;
	}
}
