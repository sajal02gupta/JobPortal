package com.dxc.jobportal.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dxc.jobportal.model.JobInfo;

@Repository
public class JobDALImp implements JobDAL{
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public JobInfo create(JobInfo job) {
		// TODO Auto-generated method stub
		return mongo.save(job);
	}

	@Override
	public boolean delete(JobInfo job) {
		// TODO Auto-generated method stub
		return mongo.remove(job).wasAcknowledged();
	}

	@Override
	public List<JobInfo> viewJob() {
		// TODO Auto-generated method stub
		return mongo.findAll(JobInfo.class);
	}
	
}
