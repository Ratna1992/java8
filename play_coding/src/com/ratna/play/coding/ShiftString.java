package com.ratna.play.coding;

public class ShiftString {

	public static String leftrotate(String str, int d) {
		String ans = str.substring(d) + str.substring(0, d);
		return ans;
	}

	public static String rightrotate(String str, int d) {
		String ans = str.substring(str.length() - d) + str.substring(0, str.length() - d);
		return ans;
	}

	public static void main(String[] args) {
		String str = "8499899121";
		int shift = 4;
		System.out.println("original string :: " + str);
		System.out.println("left shift by :: " + shift + " " + leftrotate(str, shift));
		System.out.println("right shift by :: " + shift + " " + rightrotate(str, shift));
	}

}
