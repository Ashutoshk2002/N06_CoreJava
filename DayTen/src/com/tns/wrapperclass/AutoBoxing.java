package com.tns.wrapperclass;
//program to demonstrate on autoboxing
//autoboxing:conversion of primitive to object type
public class AutoBoxing {
	public static void main(String[] args) {
		int num=97;
		Integer value=num;
		System.out.println(value);
		System.out.println(value.getClass().getName());
	}
}
