package com.dxc.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.jobportal.model.JobInfo;
import com.dxc.jobportal.repo.JobDAL;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class JobController {
	
	@Autowired
	private JobDAL jobdal;
	
	@PostMapping("/addjob")
	public JobInfo create(@RequestBody JobInfo job){
		jobdal.create(job);
		System.out.println(job);
		return job;
	}
	
	@DeleteMapping(path= {"/deletejob/{id}"})
	public boolean delete(@PathVariable String id){
		JobInfo job= jobdal.findById(id);
		return jobdal.delete(job);
		
	}
	@RequestMapping(value = "/viewjob", method = RequestMethod.GET, produces = "application/json")
	public List<JobInfo> viewall(){
		return jobdal.viewJob();
	}
	
	@PutMapping("/jobinfo/updatejob/{id}")
	public JobInfo update(@PathVariable String id, @RequestBody JobInfo job){
		return jobdal.update(job, id);
	}
	@RequestMapping(value="/findById/{id}", method= RequestMethod.GET, produces= "application/json")
	public JobInfo findById(@PathVariable String id){
		return jobdal.findById(id);
	}
}
