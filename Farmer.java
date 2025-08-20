package com.raj.bean;

public class Farmer {
	private String name;
	private String password;
	private String location;
	private long mobile;
	public Farmer(String name, String password, String location, long mobile) {
		super();
		this.name = name;
		this.password = password;
		this.location = location;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getLocation() {
		return location;
	}
	public long getMobile() {
		return mobile;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	

}
