package com.edu;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(length=20)
	private String city;
	@Column(length=20)
	private String state;
	
	
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
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public Address()
	{
		super();
		
	}
	
	
}
