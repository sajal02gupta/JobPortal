package com.dxc.jobportal.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dxc.jobportal.model.AcceptedEmployees;

@Repository
public class AcceptedEmployeesDALImp implements AcceptedEmployeesDAL{
	
	@Autowired
	private MongoTemplate mongo;

	@Override
	public AcceptedEmployees create(AcceptedEmployees a) {
		// TODO Auto-generated method stub
		return mongo.save(a);
	}
	
}
