package com.codigofacilito.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigofacilito.movies.dao.IMovieRepository;
import com.codigofacilito.movies.entities.Movie;

@Service
public class MovieService implements IMovieService {

	@Autowired
	private IMovieRepository repo;

	@Override
	public void save(Movie movie) {
		repo.save(movie);
	}

	@Override
	public Movie findById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Movie> findAll() {
		return (List<Movie>) repo.findAll();
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);

	}

}
