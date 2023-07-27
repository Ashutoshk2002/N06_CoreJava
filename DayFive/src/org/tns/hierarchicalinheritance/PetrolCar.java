package org.tns.hierarchicalinheritance;
//child class
public class PetrolCar extends Vehicle {

	private int petrolprice;
	private int mileage;
	
	public PetrolCar(String brandname, String wheelname,int petrolprice,int mileage) {
		super(brandname, wheelname);
		this.petrolprice=petrolprice;
		this.mileage=mileage;
	}
	//getters and setters
	public int getPetrolprice() {
		return petrolprice;
	}

	public void setPetrolprice(int petrolprice) {
		this.petrolprice = petrolprice;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return "PetrolCar [petrolprice=" + petrolprice + ", mileage=" + mileage + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
