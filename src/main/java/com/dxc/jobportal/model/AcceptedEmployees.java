package com.dxc.jobportal.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class AcceptedEmployees {
		private String empId;
		private String jobId;
		private String fullName;
		private String currentRole;
		private String email;
		private String mobile;
		private String skills;
		private String qualifications;
		private String yearsofExperience;
		private String resume;
		private String photo;

		public AcceptedEmployees() {
			// TODO Auto-generated constructor stub
		}

		public AcceptedEmployees(String jobId, String empId, String fullName, String currentRole, String email,
				String mobile, String skills, String qualifications, String yearsofExperience, String resume,
				String photo) {

			this.jobId = jobId;
			this.empId = empId;
			this.fullName = fullName;
			this.currentRole = currentRole;
			this.email = email;
			this.mobile = mobile;
			this.skills = skills;
			this.qualifications = qualifications;
			this.yearsofExperience = yearsofExperience;
			this.resume = resume;
			this.photo = photo;
		}

		public String getJobId() {
			return jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
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

		public String getResume() {
			return resume;
		}

		public void setResume(String resume) {
			this.resume = resume;
		}

		public String getPhoto() {
			return photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}
		
		
}
