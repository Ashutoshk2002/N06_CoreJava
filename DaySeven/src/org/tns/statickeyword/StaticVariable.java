package org.tns.statickeyword;
//program to demonstrate static keyword
class Employee{
	private int empID;
	private String name;
	static String companyName="TNSIF";
	
	//getters and setters
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	public void display(){
		System.out.println("EMP ID: "+getEmpID()+" Emp Name: "+getEmpID()+" Company Name: "+getCompanyName());
	}
	
	
	
	
	
}

public class StaticVariable {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.setEmpID(1);
		e.setName("Ashutosh");
		e.display();
		
		Employee e2=new Employee();
		e2.setEmpID(2);
		e2.setName("Sandip");
		e2.display();

	}

}
