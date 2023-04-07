package com.springnboot.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.springnboot.crud.bean.Subject;

public interface MyRepository extends CrudRepository<Subject,String> {

}
