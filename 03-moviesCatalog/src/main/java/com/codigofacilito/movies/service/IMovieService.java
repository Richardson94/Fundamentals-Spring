package com.codigofacilito.movies.service;

import java.util.List;

import com.codigofacilito.movies.entities.Movie;

public interface IMovieService {

	public void save(Movie movie);

	public Movie findById(Long id);

	public List<Movie> findAll();

	public void delete(Long id);
}
