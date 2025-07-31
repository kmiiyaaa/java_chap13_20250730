package com.kmii.ch13.test;

public class MemberDto {

	private String id;
	private String pw;
	private String name;
	private String emai;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String id, String pw, String name, String emai) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.emai = emai;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}
	
	

	
}
