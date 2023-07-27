//
package org.tns.singleinheritance;
//base class
public class Citizen {
	//private members
	private String city;
	private int pincode;
	private String area;
	private long AdhaarNo;
	
	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdhaarNo() {
		return AdhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		AdhaarNo = adhaarNo;
	}
	
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", AdhaarNo=" + AdhaarNo + "]";
	}
	
	//default constructor
	public Citizen() {
		System.out.println("Citizen Parent Class");
	}
	//parameterized constructor
	public Citizen(String city, int pincode, String area, long adhaarNo) {
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		AdhaarNo = adhaarNo;
	}
	
	
	
	
}
