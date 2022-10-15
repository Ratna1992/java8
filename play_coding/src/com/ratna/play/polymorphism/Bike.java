package com.ratna.play.polymorphism;

public class Bike extends Vehicle {

	@Override
	public void run() {
		System.out.println("bike is running");
	}

	// when overriding a static method gets CTE
	/*
	 * @Override public static double cost() { return 1300000d; }
	 */

	// access specifiers must not be more restrictive
	/*
	 * @Override private String display() { System.out.println("Bike displayed"); }
	 */

	// final methods cannot be overridden
	/*
	 * public final void yearOfManufacturing(long year) { System.out.println(year);
	 * }
	 */

	// co-variant return type
	// If the superclass method does not declare an exception, a subclass overridden
	// method can declare unchecked exception
	@Override
	public Integer milege() throws RuntimeException {
		return 23;
	}

	// If the superclass method does not declare an exception, a subclass overridden
	// method cannot declare the checked exception
	/*
	 * @Override public void run() throws Exception{
	 * System.out.println("bike is running"); }
	 */

	// If the superclass method declares an exception, a subclass overridden method
	// can declare the same, subclass exception or no exception but cannot declare
	// parent exception.

	/*
	 * @Override public void exceptionCheck() throws Exception { // TODO
	 * Auto-generated method stub super.exceptionCheck(); }
	 */

	@Override
	public void exceptionCheck() {
		System.out.println("child exception");
	}

	/*
	 * @Override public void exceptionCheck() throws Throwable { // TODO
	 * Auto-generated method stub super.exceptionCheck(); }
	 */
}
