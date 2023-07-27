package org.tns.singleinheritance;
//child class
public class Student extends Citizen {
	
	private int rollno;
	private String CollegeName;
	
	//getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	
	//parameterized constructor
	public Student(String city, int pincode, String area, long adhaarNo,int rollno,String CollegeName) {
		super(city, pincode, area, adhaarNo);
		this.rollno=rollno;
		this.CollegeName=CollegeName;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", CollegeName=" + CollegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
}
