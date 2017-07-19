package com.alex.entity.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alex.entity.jpa.Person;

public interface PersonJPARespository extends CrudRepository<Person, Integer> {

	List<Person> findAll();
}
