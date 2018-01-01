package com.test.model;

public class TestBook {

	public String id;
	public String type;
	public String desc;

	public TestBook() {
	}

	public TestBook(String id, String type, String desc) {
		super();
		this.id = id;
		this.type = type;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
