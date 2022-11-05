package com.ratna.play.designpatterns.builder;

public class Shop {

	public static void main(String[] args) {

		// without phone builder
		Phone phone = new Phone("android", 8, "qualcom", 6.6, 5000);
		System.out.println(phone);

		// with builder pattern
		PhoneBuilder phoneBuilder = new PhoneBuilder();
		Phone phone2 = phoneBuilder.setOs("IOS").setRam(10).getPhone();
		System.out.println(phone2);

	}

}
