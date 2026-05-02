package com.bean;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String city;
	private String state;
	private String pincode;
	
	public Address() {
		System.out.println("Address Default consrtuctor");
	}
	
	public Address(String city,String state,String pincode) {
		System.out.println("Address Parameterized consrtuctor");
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		System.out.println("Set City called");
		this.city=city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		System.out.println("Set State called");
		this.state=state;
	}
	
	public  String getPincode() {
		return pincode;
	}
	
	public void setPincode(String pincode) {
		
		System.out.println("Set PinCode called");
		this.pincode=pincode;
	}
	
	@Override
	public String toString() {
		return "Address [city= "+ city +", state ="+state+", pincode = "+pincode+" ]"; 
	}

}
