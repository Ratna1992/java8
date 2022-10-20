package com.ratna.play.designpatterns;

//prototype design pattern
public class Book {

	private int bId;
	private String bName;

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + "]";
	}

	public Book(int bId, String bName) {
		super();
		this.bId = bId;
		this.bName = bName;
	}
	
}
