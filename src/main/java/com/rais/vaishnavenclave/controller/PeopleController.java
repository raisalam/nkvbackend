package com.rais.vaishnavenclave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rais.vaishnavenclave.domain.People;
import com.rais.vaishnavenclave.service.PeopleService;

@RestController
public class PeopleController {
	
	@Autowired
	public PeopleService service;
	
	@GetMapping("/getAll")
	public List<People> welcome() {
		
		return service.getAllPeople();
	}
	
	@PostMapping("/addPeople")
	public People addPeople(@RequestBody People people) {
		
		return service.addPeople(people);
	}
	
	@PostMapping("/login")
	public People login(@RequestParam String email, @RequestParam String password) {
		
		return service.findPeople(email, password).orElseThrow();
	}
	
	

}
