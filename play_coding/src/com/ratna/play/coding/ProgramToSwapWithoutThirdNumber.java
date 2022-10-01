package com.ratna.play.coding;

public class ProgramToSwapWithoutThirdNumber {

	public static void main(String[] args) {

		int a = 60;
		int b = 30;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a: " + a + " b:" + b);

	}

}
