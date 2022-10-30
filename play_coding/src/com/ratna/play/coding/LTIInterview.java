package com.ratna.play.coding;

public class LTIInterview {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int group = 3;
		int iterations = 7;
		for (int i = 0; i < group; i++) {
			System.out.print(arr[i]);// 123
			System.out.println();
			for (int j = 0; j < iterations; j++) {
				try {
					System.out.print(arr[group] + 1);
				} catch (Exception e) {

				}
			}

		}

	}

}
