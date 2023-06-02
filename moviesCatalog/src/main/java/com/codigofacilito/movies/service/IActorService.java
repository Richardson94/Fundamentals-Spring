package com.codigofacilito.movies.service;

import java.util.List;

import com.codigofacilito.movies.entities.Actor;

public interface IActorService {
	public List<Actor> findAll();
	public List<Actor> findAllById(List<Long> ids);

}
