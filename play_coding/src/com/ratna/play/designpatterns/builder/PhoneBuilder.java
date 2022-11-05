package com.ratna.play.designpatterns.builder;

public class PhoneBuilder {

	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int batteryCapacity;

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public PhoneBuilder setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
		return this;
	}

	public Phone getPhone() {
		return new Phone(os, ram, processor, screenSize, batteryCapacity);
	}

}
