package com.cg.oops.part2;

public class Skill {
private int skillId;
private String skillName;
private int rating;
// generate constructor 
//setters and getters
public Skill(int skillId, String skillName, int rating) {
	super();
	this.skillId = skillId;
	this.skillName = skillName;
	this.rating = rating;
}
public int getSkillId() {
	return skillId;
}
public void setSkillId(int skillId) {
	this.skillId = skillId;
}
public String getSkillName() {
	return skillName;
}
public void setSkillName(String skillName) {
	this.skillName = skillName;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}


}
