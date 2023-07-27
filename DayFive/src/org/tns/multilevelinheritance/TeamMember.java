package org.tns.multilevelinheritance;

public class TeamMember extends TeamLead{

	private int size;
	private int duration;
	
	//parameterized constructor
	public TeamMember(String deptname, String name, int empID, String leadname, String projectname,int size,int duration) {
		super(deptname, name, empID, leadname, projectname);
		this.size=size;
		this.duration=duration;
	}
	
	//getters and setters
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}

	

	
	
	

}
