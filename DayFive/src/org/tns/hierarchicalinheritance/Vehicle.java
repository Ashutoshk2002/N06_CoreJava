package org.tns.hierarchicalinheritance;
//parent class
public class Vehicle {
	private String Brandname;
	private String Wheelname;
	
	//getters and setters
	public String getBrandname() {
		return Brandname;
	}
	public void setBrandname(String brandname) {
		Brandname = brandname;
	}
	public String getWheelname() {
		return Wheelname;
	}
	public void setWheelname(String wheelname) {
		Wheelname = wheelname;
	}
	
	//parameterized constructor
	public Vehicle(String brandname, String wheelname) {
		Brandname = brandname;
		Wheelname = wheelname;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [Brandname=" + Brandname + ", Wheelname=" + Wheelname + "]";
	}
	
	
	
	
	
	
}
