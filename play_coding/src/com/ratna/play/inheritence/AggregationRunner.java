package com.ratna.play.inheritence;

public class AggregationRunner {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId("123");
		emp.setName("Ratna");
		Address address = new Address();
		address.setCity("pamarru");
		address.setLandmark("opp-church");
		address.setStreet("kotireddypeta");
		address.setZipcode("521157");
		emp.setAddress(address);
		System.out.println(emp);

	}

}
