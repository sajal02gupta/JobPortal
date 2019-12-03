package com.dxc.jobportal.repo;

import java.util.List;

import com.dxc.jobportal.model.Employee;
import com.dxc.jobportal.model.JobInfo;


public interface EmployeeDAL {
	public Employee create(Employee emp);
	public boolean delete(Employee emp);
	
	public Employee findone(String username);
	
	public List<Employee> findAll();
	public Employee findById(String id);
	
	Employee update(String id, Employee emp);
}
