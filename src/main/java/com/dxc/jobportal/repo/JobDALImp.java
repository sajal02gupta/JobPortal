package com.dxc.jobportal.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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

	@Override
	public JobInfo findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findById(id, JobInfo.class);
	}
	
	@Override
	public JobInfo update(JobInfo job, String id) {
		// TODO Auto-generated method stub
		Query query= new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongo.save(job);
	}
}
