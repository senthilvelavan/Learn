package com.learn.Day1.Java8.pojo;

public class Address {
	
	String doorNumber;
	String streetName;
	String village;
	String city;
	String state;
	int pinCode;
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Address(String doorNumber, String streetName, String village, String city, String state, int pinCode) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.village = village;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	
	
}
