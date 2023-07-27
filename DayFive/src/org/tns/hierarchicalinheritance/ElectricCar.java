package org.tns.hierarchicalinheritance;
//child class
public class ElectricCar extends Vehicle {

	private int Eprice;
	private int range;
	
	
	public ElectricCar(String brandname, String wheelname,int Eprice,int range) {
		super(brandname, wheelname);
		this.Eprice=Eprice;
		this.range=range;
	}

	//getters and setters
	public int getEprice() {
		return Eprice;
	}


	public void setEprice(int eprice) {
		Eprice = eprice;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "ElectricCar [Eprice=" + Eprice + ", range=" + range + ", toString()=" + super.toString() + "]";
	}
	
	

}
