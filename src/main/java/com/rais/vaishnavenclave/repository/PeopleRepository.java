package com.rais.vaishnavenclave.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rais.vaishnavenclave.domain.People;

public interface PeopleRepository extends CrudRepository<People, Long>{
	List<People> findByLastName(String lastName);
	People findById(long id);

}
