package com.ratna.play.functionalinterface;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierInterfaceExample {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> UUID.randomUUID().toString();
		String string = supplier.get();
		System.out.println(string);
	}

}
