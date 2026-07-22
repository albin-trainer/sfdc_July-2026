package com.cg.oops.part2;
public class HrApp {
	public static void main(String[] args) {
		//create 3 or more skills
		//store in a array
		//create a employee object
		//store the skills in the emp object (by calling setter)
		//call print method
		Skill s1=new Skill(1,"Java",9);
		Skill s2=new Skill(2,"Database",8);
		Employee e1=new Employee(10001, "Sparsha","Sw Engineer", 50000);
		Skill skills[]= {s1,s2};
		e1.setSkills(skills);
		print(e1);
	}
	static void print(Employee emp) {
		//display emp details and skills
		emp.display();
	}
}
