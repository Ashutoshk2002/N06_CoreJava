package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;

public class UserDefinedDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> studentlist=new ArrayList<>();
		studentlist.add(new Student("Ashutosh",1,89));
		studentlist.add(new Student("Darshan",2,87));
		studentlist.add(new Student("Saish",3,55));
		studentlist.add(new Student("Abhishek",4,23));
		
		System.out.println(studentlist);
		Collections.sort(studentlist);
		System.out.println("After Sorting : ");
		System.out.println(studentlist);

	}

}
