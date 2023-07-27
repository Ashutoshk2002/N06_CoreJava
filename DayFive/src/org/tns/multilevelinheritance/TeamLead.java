package org.tns.multilevelinheritance;
//child class 1
public class TeamLead extends Manager{

	private String leadname;
	private String projectname;
	
	
	//getters and setters
	public String getLeadname() {
		return leadname;
	}

	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}

	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	//parameterized constructor
	public TeamLead(String deptname, String name, int empID,String leadname,String projectname) {
		super(deptname, name, empID);
		this.leadname=leadname;
		this.projectname=projectname;
	}

	@Override
	public String toString() {
		return "TeamLead [leadname=" + leadname + ", projectname=" + projectname + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
