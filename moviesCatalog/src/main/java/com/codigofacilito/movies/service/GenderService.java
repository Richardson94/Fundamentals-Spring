package com.codigofacilito.movies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codigofacilito.movies.dao.IGenderRepository;
import com.codigofacilito.movies.entities.Gender;

@Service
public class GenderService implements IGenderService {

	private IGenderRepository genderRepository;

	@Override
	public void save(Gender gender) {
		genderRepository.save(gender);
	}

	@Override
	public Gender findById(Long id) {
		return genderRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		genderRepository.deleteById(id);

	}

	@Override
	public List<Gender> findAll() {
		return (List<Gender>) genderRepository.findAll();
	}

}
