package com.dxc.jobportal.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

public class JobInfo {
	@Id
	private String jobId;
	private String jobTitle;
	private String jobCategory;
	private String primaryLocation;
	private String additionalLocation;
	private String schedule;
	private String jobType;
	@CreatedDate
	private Date postingDate = new Date();
	private String jobSummary;
	private String jobDescription;
	private List<String> jobQualification;
	private String workEnvironment;
	private String recruiter;
	private String similarJobs;
	private String yearsofExperience;
	
	public JobInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobInfo(String jobId, String jobTitle, String jobCategory, String primaryLocation, String additionalLocation,
			String schedule, String jobType, String jobSummary, String jobDescription,
			List<String> jobQualification, String workEnvironment, String recruiter, String similarJobs,
			String yearsofExperience) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobCategory = jobCategory;
		this.primaryLocation = primaryLocation;
		this.additionalLocation = additionalLocation;
		this.schedule = schedule;
		this.jobType = jobType;
		this.jobSummary = jobSummary;
		this.jobDescription = jobDescription;
		this.jobQualification = jobQualification;
		this.workEnvironment = workEnvironment;
		this.recruiter = recruiter;
		this.similarJobs = similarJobs;
		this.yearsofExperience = yearsofExperience;
	}
	

	public String getYearsofExperience() {
		return yearsofExperience;
	}

	public void setYearsofExperience(String yearsofExperience) {
		this.yearsofExperience = yearsofExperience;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	public String getPrimaryLocation() {
		return primaryLocation;
	}

	public void setPrimaryLocation(String primaryLocation) {
		this.primaryLocation = primaryLocation;
	}

	public String getAdditionalLocation() {
		return additionalLocation;
	}

	public void setAdditionalLocation(String additionalLocation) {
		this.additionalLocation = additionalLocation;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	public String getJobSummary() {
		return jobSummary;
	}

	public void setJobSummary(String jobSummary) {
		this.jobSummary = jobSummary;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public List<String> getJobQualification() {
		return jobQualification;
	}

	public void setJobQualification(List<String> jobQualification) {
		this.jobQualification = jobQualification;
	}

	public String getWorkEnvironment() {
		return workEnvironment;
	}

	public void setWorkEnvironment(String workEnvironment) {
		this.workEnvironment = workEnvironment;
	}



	public String getRecruiter() {
		return recruiter;
	}



	public void setRecruiter(String recruiter) {
		this.recruiter = recruiter;
	}



	public String getSimilarJobs() {
		return similarJobs;
	}

	public void setSimilarJobs(String similarJobs) {
		this.similarJobs = similarJobs;
	}
	
}
