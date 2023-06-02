package com.codigofacilito.movies.service;

import java.util.List;

import com.codigofacilito.movies.entities.Gender;

public interface IGenderService {
	public void save(Gender gender);
	public Gender findById(Long id);
	public void delete(Long id);
	public List<Gender> findAll();
}
