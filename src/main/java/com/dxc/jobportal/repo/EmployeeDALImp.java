package com.dxc.jobportal.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.dxc.jobportal.model.Employee;

@Repository
public class EmployeeDALImp implements EmployeeDAL{
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		return mongo.save(emp);
	}

	@Override
	public boolean delete(Employee emp) {
		// TODO Auto-generated method stub
		return mongo.remove(emp).wasAcknowledged();
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Employee.class);
	}

	@Override
	public Employee findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findById(id, Employee.class);
	}

	@Override
	public Employee findone(String username) {
		// TODO Auto-generated method stub
		Employee e =  mongo.findOne(new Query(Criteria.where("username").is(username)), Employee.class);
		System.err.println(e);
		return e;
	}

	
}