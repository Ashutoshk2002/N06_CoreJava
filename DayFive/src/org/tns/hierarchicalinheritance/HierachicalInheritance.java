//demonstration of Hierachical Inheritance 
package org.tns.hierarchicalinheritance;
//driver class
public class HierachicalInheritance {

	public static void main(String[] args) {
		
		PetrolCar p=new PetrolCar("BMW", "Apollo", 110, 50);
		System.out.println(p);
		
		ElectricCar e=new ElectricCar("Ather", "MRF", 10, 100);
		System.out.println(e);
	}

}
