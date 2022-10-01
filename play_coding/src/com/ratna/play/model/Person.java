package com.ratna.play.model;

public class Person {

	private String name;
	private Integer age;
	private String desgId;
	private String mobileNo;
	
	public Person(String name, Integer age, String desgId, String mobileNo) {
		super();
		this.name = name;
		this.age = age;
		this.desgId = desgId;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", desgId=" + desgId + ", mobileNo=" + mobileNo + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDesgId() {
		return desgId;
	}
	public void setDesgId(String desgId) {
		this.desgId = desgId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
