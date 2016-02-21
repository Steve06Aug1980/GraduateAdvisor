package edu.umsl.grad.advisor.bean;

import java.util.List;

import edu.umsl.grad.advisor.tree.OrClause;

public class Course {
	private String subject;
	private String courseNumber;
	private String courseName;
	private int credit;
	private String courseDescription;
	private boolean canSelectMultiple;
	private List<OrClause> prerequisiteList;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public boolean isCanSelectMultiple() {
		return canSelectMultiple;
	}

	public void setCanSelectMultiple(boolean canSelectMultiple) {
		this.canSelectMultiple = canSelectMultiple;
	}

	public List<OrClause> getPrerequisiteList() {
		return prerequisiteList;
	}

	public void setPrerequisiteList(List<OrClause> prerequisiteList) {
		this.prerequisiteList = prerequisiteList;
	}
}
