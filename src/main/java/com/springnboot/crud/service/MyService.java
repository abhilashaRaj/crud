package com.springnboot.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springnboot.crud.bean.Subject;
import com.springnboot.crud.repository.MyRepository;

@Service
public class MyService {
	
	@Autowired
	public MyRepository myrepo;
	public List<Subject>getAllSubjects()
	{
		List<Subject>subjects= new ArrayList<>();
		myrepo.findAll().forEach(subjects::add);
		return subjects;
	}
	public void addSubject(Subject subject)
	{
		myrepo.save(subject);
	}
	public void updateSubject(String id,Subject subject)
	{
		myrepo.save(subject);
	}
	public void deleteSubject(String id)
	{
		myrepo.deleteById(id);
	}
	
}
