package com.codigofacilito.movies.dao;

import org.springframework.data.repository.CrudRepository;

import com.codigofacilito.movies.entities.Movie;

public interface IMovieRepository extends CrudRepository<Movie,Long>{

}
