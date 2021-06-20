package com.rais.vaishnavenclave.service;

import java.util.List;
import java.util.Optional;

import com.rais.vaishnavenclave.domain.People;

public interface PeopleService {
	
	public List<People> getAllPeople();
	public Optional<People> findPeople(String email, String password);
	public People addPeople(People people);
	public void deletePeople(long id);


}
