//program to demonstrate encapuslation
/*Encapsulation achieves a data hiding using private access specifiers*/
package com.tns.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		UBOI u=new UBOI();
		//setting a value to private data members
		u.setAccountNo(965948332);
		u.setAccType("Saving");
		u.setAtmCardNo(487956325);
		u.setPinNo(9876);
		
		System.out.println(u.toString());

	}

}
