package com.ratna.play.model;

public class PersonModel {
	private String name;
	private Integer age;
	private String desgId;
	private String mobileNo;
	private String designation;

	@Override
	public String toString() {
		return "PersonModel [name=" + name + ", age=" + age + ", desgId=" + desgId + ", mobileNo=" + mobileNo
				+ ", designation=" + designation + "]";
	}

	public PersonModel(String name, Integer age, String desgId, String mobileNo, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.desgId = desgId;
		this.mobileNo = mobileNo;
		this.designation = designation;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
