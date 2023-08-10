package com.tns.uncheckedexception;


public class ThrowKeyword {
	static void validate(int age,int weight) throws Exception {
		if(age>18 || weight>40) {
			throw new Exception("Criteria Not Matched");
		}
	}
	public static void main(String[] args)   {
		try { 
			validate(17,42);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
