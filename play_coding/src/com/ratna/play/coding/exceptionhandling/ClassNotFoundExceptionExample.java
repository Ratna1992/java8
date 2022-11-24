package com.ratna.play.coding.exceptionhandling;

public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
