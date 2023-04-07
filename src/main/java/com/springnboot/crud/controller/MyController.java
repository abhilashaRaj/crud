package com.springnboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springnboot.crud.bean.Subject;
import com.springnboot.crud.service.MyService;

@RestController
public class MyController {
	@Autowired
	private MyService myservice;
	@RequestMapping("/subjects")
	public List<Subject>getAllSubjects()
	{
		return myservice.getAllSubjects();		
	}
	/*@RequestMapping(value = "/subjects/{id}")
	public List<Subject> getSubject(@PathVariable String id) {
	    return SubjectService.getSubject(id);
	}*/
	@RequestMapping(method=RequestMethod.POST,value="/subjects")
	public void addSubject(@RequestBody Subject subject)
	{
		myservice.addSubject(subject);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/subjects/{id}")
	public void updateSubject(@PathVariable String id,@RequestBody Subject subject)
	{
		myservice.updateSubject(id,subject);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="subjects/{id}")
	public void DeleteSubject(@PathVariable String id, @RequestBody Subject subject)
	{
		myservice.deleteSubject(id);
	}
	
}
