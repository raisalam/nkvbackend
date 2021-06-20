package com.rais.vaishnavenclave.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.rais.vaishnavenclave.domain.People;
import com.rais.vaishnavenclave.repository.PeopleRepository;

@Service
public class PeopleServiceImpl implements PeopleService{

	@Autowired
	public PeopleRepository repository;
	@Override
	public List<People> getAllPeople() {

		return  Lists.newArrayList(repository.findAll());
	}
	@Override
	public People addPeople(People people) {
		return repository.save(people);
	}
	@Override
	public void deletePeople(long id) {
		repository.deleteById(id);
	}
	@Override
	public Optional<People> findPeople(String email, String password) {
		return repository.findByEmailAndPassword(email, password);
	}

}
