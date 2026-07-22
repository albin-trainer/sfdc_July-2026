package com.cg.oops.part2;
public class Employee {
private int employeeId;
private String employeeName;
private String designation;
private float salary;
private Skill skills[];
//generate parameterized constructor 
public Employee(int employeeId, String employeeName, String designation, float salary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.designation = designation;
	this.salary = salary;
}
public Skill[] getSkills() {
	return skills;
}
public void setSkills(Skill[] skills) {
	this.skills = skills;
}

//which accepts id, name, desig, salary
//setter , getter for skills
//getter for other fields
void display() {
	System.out.println("Employee Id "+employeeId);
	System.out.println("Emp name : "+employeeName);
	System.out.println("Designation : "+designation);
	for(Skill s:skills) {
		System.out.println("Skill id :"+s.getSkillId());
		System.out.println("Skillname :"+ s.getSkillName());
		System.out.println("Rating : "+s.getRating());
		System.out.println("**********");
	}
	
}
}
