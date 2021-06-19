package com.rais.vaishnavenclave.service;

import java.util.List;

import com.rais.vaishnavenclave.domain.People;

public interface PeopleService {
	
	public List<People> getAllPeople();
	public People addPeople(People people);
	public void deletePeople(long id);


}
