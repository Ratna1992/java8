package com.ratna.play.exceptionhandling;

public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
