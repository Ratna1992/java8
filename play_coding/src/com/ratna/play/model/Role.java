package com.ratna.play.model;

public class Role {

	private String designationId;
	private String designation;
	public String getDesignationId() {
		return designationId;
	}
	public void setDesignationId(String designationId) {
		this.designationId = designationId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Role [designationId=" + designationId + ", designation=" + designation + "]";
	}
	public Role(String designationId, String designation) {
		super();
		this.designationId = designationId;
		this.designation = designation;
	}
	
}
