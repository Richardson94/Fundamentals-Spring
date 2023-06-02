package com.codigofacilito.movies.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codigofacilito.movies.entities.Gender;
import com.codigofacilito.movies.service.IGenderService;

@RestController
public class GenderController { 
	
	private IGenderService service;
	
	public GenderController(IGenderService service) {
		this.service = service;

	}
	
	@PostMapping("gender")
	public Long save(@RequestParam String name) {
		Gender gender = new Gender();
		gender.setName(name);
		
		service.save(gender);
		
		return gender.getId();
	}
	
	@GetMapping("genders/{id}")
	public String findById(@PathVariable(name="id")Long id) {

		return service.findById(id).getName();
	}
	
}
