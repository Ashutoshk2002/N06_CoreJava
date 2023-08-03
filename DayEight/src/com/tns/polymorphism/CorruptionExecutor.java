package com.tns.polymorphism;
//program to demonstrate of method overriding
class ChiefMinister{
	 static void corruption(long money) {
		System.out.println("Corrupted Money(CM) : "+money);
	}
}

class MLA extends ChiefMinister{
	 static void corruption(long money) {
		System.out.println("Corrupted Money(MLA) : "+money);
	}
}

public class CorruptionExecutor {

	public static void main(String[] args) {
		
		MLA.corruption(1000000);
		
		
		ChiefMinister.corruption(50000);
		

	}

}
