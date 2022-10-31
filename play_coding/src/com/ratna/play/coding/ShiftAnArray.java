package com.ratna.play.coding;

import java.util.Arrays;

public class ShiftAnArray {

	public static void main(String[] args) {
		rotate(new int[] { 1, 2, 3, 4, 5 }, 1);
	}

	public static void rotate(int[] nums, int k) {
		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[(i + k) % nums.length] = nums[i];
		}
		System.out.println(Arrays.toString(ans));
	}

}
