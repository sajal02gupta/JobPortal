package com.dxc.jobportal.repo;

import java.util.List;

import com.dxc.jobportal.model.JobInfo;

public interface JobDAL {

	public JobInfo create(JobInfo job);
	public boolean delete(JobInfo job);
	
	public List<JobInfo> viewJob();
	
}
