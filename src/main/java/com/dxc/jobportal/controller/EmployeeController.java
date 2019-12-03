package com.dxc.jobportal.controller;
import com.dxc.jobportal.model.Employee;
import com.dxc.jobportal.repo.EmployeeDAL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="https://localhost:4200")
@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeDAL emprepo;
	
	@PostMapping("/employees")
	public Employee create(@RequestBody Employee emp) {
		System.err.println("printing emp data..."+emp);
		return emprepo.create(emp);
	}
	
	@GetMapping("/findone/{username}")
	public Employee findone(@PathVariable String username){
		return emprepo.findone(username);
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return emprepo.findAll();
	}
 
	@RequestMapping(value="/employees/findById/{id}", method= RequestMethod.GET, produces= "application/json")
	public Employee findById(@PathVariable String id){
		return emprepo.findById(id);
	}
	
	@PutMapping("/employees/updateemployee/{id}")
	public Employee update(@PathVariable String id, @RequestBody Employee emp){
		return emprepo.update(id, emp);
	}
	
}
