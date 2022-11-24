package com.ratna.play.coding.exceptionhandling;

public class Child extends Parent {
	/*
	 * @Override public void display() throws Exception { // cannot declare checked
	 * exception }
	 */

	@Override
	public void display() throws RuntimeException {
		// can declare unchecked exception
		System.out.println("child display ...");
	}

	@Override
	public void calculate(int a, int b) throws ArithmeticException {
		super.calculate(a, b);
	}

	@Override
	public void calculate(int a, int b, int c) throws ArithmeticException {
		// TODO Auto-generated method stub
		super.calculate(a, b, c);
	}

	// cannot throw parent exception
	/*
	 * @Override public void calculate(int a, int b, int c, int d) throws Exception
	 * { // TODO Auto-generated method stub super.calculate(a, b, c, d); }
	 */
}
