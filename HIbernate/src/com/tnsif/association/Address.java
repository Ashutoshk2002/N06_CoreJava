package com.tnsif.association;

import javax.persistence.Entity;
import javax.persistence.Id;

// one to one
@Entity
public class Address {
	@Id
	private int addressId;
	private String city;
	private String street;
	private String state;
	private String zipcode;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Adress [addressId=" + addressId + ", city=" + city + ", street=" + street + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
	
}
