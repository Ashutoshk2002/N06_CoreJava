package org.tns.interfacedemo;

public class Human implements ColdDrink,AlcoholDrink {
	public static void main(String[] args) {
		ColdDrink.print();
		AlcoholDrink.print();
		System.out.println(AlcoholDrink.name);
		System.out.println(ColdDrink.name);
	}
}
