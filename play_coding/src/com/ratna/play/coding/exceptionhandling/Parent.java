package com.ratna.play.coding.exceptionhandling;

public class Parent {

	public void display() {
		System.out.println("parent display ....");
	}

	public void calculate(int a, int b) throws ArithmeticException {
		System.out.println(a + b);
	}

	public void calculate(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void calculate(int a, int b, int c, int d) throws ArithmeticException {
		System.out.println(a + b + c + d);
	}
}
