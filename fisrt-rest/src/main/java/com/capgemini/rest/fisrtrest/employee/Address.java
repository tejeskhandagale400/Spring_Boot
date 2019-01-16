package com.capgemini.rest.fisrtrest.employee;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int flatNo;
	private String city;
	private int pinCode;
	private String state;
	public Address() {
		super();
	}
	
	public Address(int flatNo, String city, int pinCode, String state) {
		super();
		this.flatNo = flatNo;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}

	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
