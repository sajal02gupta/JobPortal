package com.dxc.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.jobportal.model.AcceptedEmployees;
import com.dxc.jobportal.repo.AcceptedEmployeesDAL;

@RestController
public class AcceptedEmployeesController {
	@Autowired
	public AcceptedEmployeesDAL acDal;
	
	@PostMapping("/appliedemployees")
	public AcceptedEmployees create(@RequestBody AcceptedEmployees acemp){
		acDal.create(acemp);
		System.out.println(acemp);
		return acemp;
	}

}
