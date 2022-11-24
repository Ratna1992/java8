package com.ratna.play.polymorphism;

public class CompileTimePolymorphism {

	// method overloading by changing no. of arguments

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// Method Overloading: changing data type of arguments

	public long add(int a, long b) {
		return a + b;
	}

	// method overloading type promotion

	public double add(long a, int b, double c) {
		return a + b + c;
	}

	// method overloading by return type not possible because of ambiguity

	/*
	 * public double add(int a, int b) { return a + b; }
	 */

	// main method overloading
	public static void main(String[] args) {
		System.out.println("main()");
	}

	public static void main(byte[] args) {
		System.out.println("main()");
	}

	public static void main(byte[] args, String msg) {
		System.out.println("main()");
	}

	// final methods can be overloaded
	public final void age(int age) {
		System.out.println(age);
	}

	public final void age(double age) {
		System.out.println(age);
	}

	// private methods can be overloaded
	private void age(String age) {
		System.out.println(age);
	}

	private void age(long age) {
		System.out.println(age);
	}
}
