package com.dxc.jobportal.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Employee {

	@Id
	private String empId;
	private String fullName;
	private String currentRole;
	private String username;
	private String email;
	private String password;
	private String mobile;
	private String skills;
	private String qualifications;
	private String yearsofExperience;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String fullName, String currentRole, String username, String email, String password,
			String mobile, String skills, String qualifications, String yearsofExperience) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.currentRole = currentRole;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.skills = skills;
		this.qualifications = qualifications;
		this.yearsofExperience = yearsofExperience;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public String getYearsofExperience() {
		return yearsofExperience;
	}

	public void setYearsofExperience(String yearsofExperience) {
		this.yearsofExperience = yearsofExperience;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", currentRole=" + currentRole + ", username="
				+ username + ", email=" + email + ", password=" + password + ", mobile=" + mobile + ", skills=" + skills
				+ ", qualifications=" + qualifications + ", yearsofExperience=" + yearsofExperience + "]";
	}

}
