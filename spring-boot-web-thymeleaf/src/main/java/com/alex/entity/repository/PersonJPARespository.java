package com.alex.entity.repository;

import org.springframework.data.repository.CrudRepository;

import com.alex.entity.jpa.Person;

public interface PersonJPARespository extends CrudRepository<Person, Integer> {

}
